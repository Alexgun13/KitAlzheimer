package alzheimer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JMenuBar;

public class Config_basico extends JPanel {
	//funciona
	private JPanel contentPane;
	private JTextField valACAmp;
	private JTextField valDCAmp;
	private JTextField valFreqIni;
	private JTextField valFreqFin;
	private JTextField valInterFreq;
	private JTextField valAverage;
	private Component horizontalStrut;

	/**
	 * Create the panel.
	 */
	public Config_basico() {
		setLayout(null);
		
		JLabel lblAcAmplitude = new JLabel("AC Amplitude");
		lblAcAmplitude.setBounds(21, 14, 64, 14);
		add(lblAcAmplitude);
		
		valACAmp = new JTextField();
		valACAmp.setBounds(102, 11, 86, 20);
		add(valACAmp);
		valACAmp.setColumns(10); 
		
		JLabel lblDcAmplitude = new JLabel("DC Amplitude");
		lblDcAmplitude.setBounds(21, 36, 64, 14);
		add(lblDcAmplitude);
		
		valDCAmp = new JTextField();
		valDCAmp.setBounds(102, 36, 86, 20);
		valDCAmp.setColumns(10);
		add(valDCAmp);
		
		JLabel lblFreqInit = new JLabel("Freq. init");
		lblFreqInit.setBounds(32, 64, 43, 14);
		add(lblFreqInit);
		
		valFreqIni = new JTextField();
		valFreqIni.setBounds(102, 61, 86, 20);
		valFreqIni.setColumns(10);
		add(valFreqIni);
		
		JLabel lblFreqFinal = new JLabel("Freq. final");
		lblFreqFinal.setBounds(29, 89, 49, 14);
		add(lblFreqFinal);
		
		valFreqFin = new JTextField();
		valFreqFin.setBounds(102, 86, 86, 20);
		valFreqFin.setColumns(10);
		add(valFreqFin);
		
		JLabel lblIntervalInterfreq = new JLabel("Interval interfreq.");
		lblIntervalInterfreq.setBounds(10, 114, 87, 14);
		add(lblIntervalInterfreq);
		
		valInterFreq = new JTextField();
		valInterFreq.setBounds(102, 111, 86, 20);
		valInterFreq.setColumns(10);
		add(valInterFreq);
		
		JLabel lblAverageSamples = new JLabel("Average samples");
		lblAverageSamples.setBounds(10, 139, 87, 14);
		add(lblAverageSamples);
		
		valAverage = new JTextField();
		valAverage.setBounds(102, 136, 86, 20);
		valAverage.setColumns(10);
		add(valAverage);

	}

}
