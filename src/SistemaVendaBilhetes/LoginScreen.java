package SistemaVendaBilhetes;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;

public class LoginScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//PANELS
	JPanel loginScreen = new JPanel();
	JPanel mainPanel = new JPanel();
	JPanel panelForLabels = new JPanel();
	JPanel panelForFields = new JPanel();
	
	//BUTTONS
	JButton loginButton = new JButton("Login");
	
	//LABELS 
	JLabel titulo = new JLabel("LOGIN", SwingConstants.CENTER);
	JLabel placeholder1 = new JLabel("Login:");
	JLabel placeholder2 = new JLabel("Password:");
	
	//TEXT FIELDS
	JTextField loginField = new RoundJTextField(10);
	JTextField passwordField = new RoundJPasswordField(10);
	
	//FONTS
	Font f1 = new Font("Calibri", Font.PLAIN, 25);
	
	public LoginScreen() {
		super("Login Screen");
		
        setSize(300, 220);
        setLocation(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        loginScreen.setLayout(new BoxLayout(loginScreen, BoxLayout.PAGE_AXIS));
        loginScreen.setBackground(Color.orange);
        
        titulo.setFont(f1);
        titulo.setForeground(Color.black);
        
        panelForLabels.setLayout(new BoxLayout(panelForLabels, BoxLayout.PAGE_AXIS));
        panelForLabels.setBackground(Color.orange);
        
        panelForFields.setLayout(new BoxLayout(panelForFields, BoxLayout.PAGE_AXIS));
        panelForFields.setBackground(Color.orange);
        panelForFields.setPreferredSize( new Dimension( 200, 80 ) );
        //panelForFields.setBorder(BorderFactory.createLineBorder(Color.black));
        
        loginField.setMaximumSize(new Dimension(200, 30));
        passwordField.setMaximumSize(new Dimension(200, 30));
        
        panelForLabels.add(Box.createRigidArea(new Dimension(5, 7)));
        panelForLabels.add(placeholder1);
        panelForLabels.add(Box.createRigidArea(new Dimension(5, 20)));
        panelForLabels.add(placeholder2);
        panelForLabels.setPreferredSize( new Dimension( 70, 80 ) );
        //panelForLabels.setBorder(BorderFactory.createLineBorder(Color.black));
        
        panelForFields.add(loginField);
        panelForFields.add(Box.createRigidArea(new Dimension(5, 10)));
        panelForFields.add(passwordField);
        
        mainPanel.add(panelForLabels);
        mainPanel.add(panelForFields);
        mainPanel.setSize( new Dimension( 150, 100 ) );
        mainPanel.setBackground(Color.orange);
       // mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        loginScreen.add(titulo);
        loginScreen.add(mainPanel);
        loginScreen.add(loginButton);
        add(loginScreen);
	}
}