package co.edu.uniandes.graphics.gui;


import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JPanel;

public class PanelLienzo extends JPanel {
	public PanelLienzo(){
		setPreferredSize(new Dimension (700,700));
	}
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		//Stroke
		//g2D.setStroke(new BasicStroke(5));

		//Color (.fillFigura)
		
		//Linea
		//g2D.drawLine(0, 0, 700, 700);
		
		
		g2D.setColor(Color.gray);
		g2D.drawRect(0, 0, 700, 400);
		g2D.drawRoundRect(345, 200, 15, 40,20, 20);
		g2D.drawRoundRect(440, 200, 15, 40, 20, 20);
		
		
		g2D.setColor(Color.black);
		Ellipse2D.Double elipse1 = new Ellipse2D.Double(350, 30, 100, 100);
		g2D.draw(elipse1);
		g2D.drawRect(390, 130, 20, 40);
		g2D.drawRoundRect(320, 170, 25, 180, 20, 20);
		g2D.drawRoundRect(455, 170, 25, 180, 20, 20);
		g2D.drawRect(335, 170, 130, 40);
		g2D.drawRect(360, 170, 80, 180);
		g2D.drawRoundRect(360, 330, 35, 180, 20, 20);
		g2D.drawRoundRect(405, 330, 35, 180, 20, 20);
		
		//Poligono
		int[] xCoord = {230,250,550,570};
		int[] yCoord = {550,500,500,550};		
		g2D.drawPolygon(xCoord, yCoord, 4);
		
		//Reto 1 - Gato con circulos, triangulos, lineas y arcos
		g2D.setStroke(new BasicStroke(7));
		//Orejas
		int[] xLeft = {55,65,90};
		int[] yLeft = {535,460,500};
		Polygon lEar = new Polygon(xLeft, yLeft, 3);
		g2D.draw(lEar);
		
		int[] xRight = {148,140,115};
		int[] yRight = {535,460,500};
		Polygon rEar = new Polygon(xRight, yRight, 3);
		g2D.draw(rEar);
		g2D.setColor(new Color (252, 128, 102));
		g2D.fillPolygon(rEar);
		g2D.fillPolygon(lEar);
		
		//Cabeza
		g2D.setColor(Color.black);
		Ellipse2D.Double cabeza = new Ellipse2D.Double(50,500,100,100);
		
		g2D.draw(cabeza);
		g2D.setColor(Color.gray);
		g2D.fill(cabeza);
		
		

		//Ojos
		g2D.setColor(new Color(61, 243, 226));
		g2D.setStroke(new BasicStroke(1));
		g2D.fillOval(70, 535, 15, 15);
		g2D.fillOval(114, 535, 15, 15);
		g2D.setColor(Color.black);
		
		g2D.fillOval(76, 538, 3, 9);
		g2D.fillOval(120, 538, 3, 9);
		//Nariz 
		g2D.setColor(new Color (252, 128, 102));
		int[] xNariz = {89,100,111};
		int[] yNariz = {555,570,555};
		g2D.fillPolygon(xNariz, yNariz, 3);
		

		//Boca
		g2D.setColor(Color.black);
		g2D.drawArc(82, 565, 18, 10, 180, 180);
		g2D.drawArc(100, 565, 18, 10, 180, 180);
		//Bigotes
		g2D.setColor(new Color(185, 202, 201));
		
		g2D.drawLine(130, 565, 175, 565);
		g2D.drawLine(130, 570, 175, 580);
		g2D.drawLine(130, 560, 175, 550);
		
		g2D.drawLine(75, 565, 30, 565);
		g2D.drawLine(75, 570, 30, 580);
		g2D.drawLine(75, 560, 30, 550);
		
		g2D.setColor(Color.black);
		g2D.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		g2D.drawString("Reto 1: Michi dibujado", 0, 625);
		
		//Reto2 Figura sin usar las tipicas (VAMO A HACER UNA POKEBOLA)
		
		g2D.setColor(Color.red);
		g2D.fillArc(50, 100, 150, 150, 0, 180);
		g2D.setColor(Color.white);
		g2D.fillArc(50, 100, 150, 150, 180, 180);
		
		g2D.setColor(Color.black);
		g2D.setStroke(new BasicStroke(6));
		g2D.drawArc(50, 100, 150, 150, 0, 180);
		g2D.drawArc(50, 100, 150, 150, 180, 180);
		g2D.drawLine(54, 175, 197, 175);
		g2D.setColor(Color.white);
		g2D.fillArc(105, 155, 40, 40, 0, 180);
		g2D.fillArc(105, 155, 40, 40, 180, 180);
		g2D.setColor(Color.black);
		g2D.drawArc(105, 155, 40, 40, 0, 180);
		g2D.drawArc(105, 155, 40, 40, 180, 180);
		g2D.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		g2D.drawString("Reto 2: Pokebola solo con arcos y lineas", 20, 75);
	}
	
	
}
