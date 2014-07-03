package alzheimer;

import touch.TouchControl;
import touch.TouchControl_Resistive_IOIO;
import ioio.lib.api.AnalogInput;
import ioio.lib.api.DigitalInput;
import ioio.lib.api.DigitalOutput;
import ioio.lib.api.IOIO;
import ioio.lib.api.exception.ConnectionLostException;
import ioio.lib.util.BaseIOIOLooper;
import ioio.lib.util.IOIOLooper;
import ioio.lib.util.IOIOLooperProvider;
import ioio.lib.util.pc.IOIOPcApplicationHelper;

public class IOIORecibe implements IOIOLooperProvider {

	IOIOPcApplicationHelper IOIOConnection = new IOIOPcApplicationHelper(this);

	// pin functions and numbers to be used
	
	public int posicion=0;
	private final int pin_Yn = 41;// 46
	private final int pin_Xn = 42;// 45
	private final int pin_Yp = 43;// 44
	private final int pin_Xp = 44;// 43
	public static boolean reinicia = false;
	public static double[] datosx = new double[20];
	public static double[] datosy = new double[20];
	public static double[] datost = new double[20];

	@Override
	public IOIOLooper createIOIOLooper(String connectionType, Object extra) {
		return new BaseIOIOLooper() {
			TouchControl toucher;
			long t0 = System.nanoTime();

			// setup method: it is called in the first connection
			@Override
			protected void setup() throws ConnectionLostException,
					InterruptedException {
				toucher = new TouchControl_Resistive_IOIO(pin_Xn, pin_Xp, pin_Yn, pin_Yp, 324,
						240, true, ioio_);
			}

			// loop: it is called continuously
			@Override
			public void loop() throws InterruptedException,
					ConnectionLostException {
				double now = (System.nanoTime() - t0) / 1e9;
				int[] point = toucher.getPoint();
				System.out.println("x = " + point[0] + "   y = " + point[1]
						+ "    touch = " + point[2]);
				Thread.sleep(500);
			
				
				/// LECTURA DE DATOS
				
				/// PAUSA HASTA EL SIGUIENTE CICLO
				Thread.sleep(500);
				
				if (posicion<20){
					datosx[posicion]= point[0];
					datosy[posicion]= point[1];
					datost[posicion]= point[2];
					
				}
				
				posicion=posicion+1;
				reinicia = false;
				if(reinicia == true){
					posicion=0;
				}
					}
			};
	}

	// starts the ioio board (setup() is called, and then loop())
	public void start() {
		IOIOConnection.start();
		posicion = 0;
		
		createIOIOLooper("", "");
	}

	// stops the ioio board (stops loop() and disconnects)
	public void stop() {
		IOIOConnection.stop();
	}

	public static double[] obtenDatosx(){
	return datosx;
}
	public static double[] obtenDatosy(){
		return datosy;
	}
	public static double[] obtenDatost(){
		return datost;
	}
}