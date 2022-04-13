package co.edu.uniandes.graphics.gui;

import java.awt.*;

import javax.swing.JFrame;

public class InterfazPrincipal extends JFrame{
	PanelLienzo panel;
	
	public InterfazPrincipal() 
	{
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		panel = new PanelLienzo();
		this.add(panel);
		this.pack();        
        setLocationRelativeTo( null );
        setVisible(true);
        setTitle( "Retos de Graphics 2D" );
	}
	

	
	
	public static void main(String[] args)
	{
		InterfazPrincipal interfaz = new InterfazPrincipal();
	}
}
