package alzheimer;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;

public class CheckLista extends JPanel {
	public static String dato = "dato1";

	/**
	 * Create the panel.
	 */
	public CheckLista(String nombre) {
		setLayout(new BorderLayout(0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox(nombre);
		add(chckbxNewCheckBox, BorderLayout.CENTER);

	}

}
