package SistemaVendaBilhetes;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;

public class MainScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//PANELS
	JPanel mainScreen = new JPanel();
	
	public MainScreen() {
		super("Venda de Bilhetes");
		
        setSize(1200, 800);
        setLocation(150, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        mainScreen.setBackground(Color.orange);
        
        add(mainScreen);
	}
}