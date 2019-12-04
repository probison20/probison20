package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.ComponentOrientation;
import java.awt.Panel;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.FlowLayout;

import javax.swing.UIManager;

public class test extends JFrame 
{

	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JPanel contentPane;
	private JButton btnSaveFile;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JLabel lblUploadedFile;
	private JLabel lblNewLabel_1;
	private JRadioButton rdbtnNewRadioButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1520, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Text Formatting");
		lblNewLabel.setBounds(5, 5, 1489, 34);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Upload File");
		btnNewButton.setBounds(5, 607, 1489, 43);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contentPane.add(btnNewButton);
		
		btnSaveFile = new JButton("Save File");
		btnSaveFile.setBounds(5, 655, 1489, 43);
		btnSaveFile.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contentPane.add(btnSaveFile);
		
		textPane = new JTextPane();
		textPane.setName("Uploaded Text Document");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane.setBounds(10, 125, 750, 471);
		contentPane.add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setToolTipText("Hi");
		textPane_1.setName("Preview Formatted File");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane_1.setForeground(new Color(0, 0, 0));
		textPane_1.setBounds(770, 125, 719, 471);
		contentPane.add(textPane_1);
		
		lblUploadedFile = new JLabel("Uploaded File");
		lblUploadedFile.setHorizontalAlignment(SwingConstants.CENTER);
		lblUploadedFile.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblUploadedFile.setBounds(10, 81, 750, 33);
		contentPane.add(lblUploadedFile);
		
		lblNewLabel_1 = new JLabel("Preview");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(770, 81, 719, 33);
		contentPane.add(lblNewLabel_1);
		
		rdbtnNewRadioButton = new JRadioButton("View Error Logs");
		rdbtnNewRadioButton.setBorder(new LineBorder(UIManager.getColor("Button.foreground")));
		rdbtnNewRadioButton.setBackground(UIManager.getColor("Button.light"));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		rdbtnNewRadioButton.setBounds(6, 705, 1488, 43);
		contentPane.add(rdbtnNewRadioButton);
		
		handler thehandler = new handler();
		btnNewButton.addActionListener(thehandler);
		btnSaveFile.addActionListener(thehandler);
		rdbtnNewRadioButton.addActionListener(thehandler);
	}
	
	private class handler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == btnNewButton)
			{
				//For testing purposes. Once you can get the file input I would use a getline or something.
				textPane.setText("Corn.");
				textPane_1.setText("Corn.");
				
				//Open file explorer
				//It would be here that we would implement the flags.
			}
			if(event.getSource() == btnSaveFile)
			{
				//Create new text file.
			}
			if(event.getSource() == rdbtnNewRadioButton)
			{
				if(rdbtnNewRadioButton.isSelected())
				{
					//Set text pane to error log
				}
				else
				{
					//Set the original text file
				}
			}
		}
	}
}
