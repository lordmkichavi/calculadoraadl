package co.com.adl.builder;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JTextField;

public class Pantalla extends JTextField {

	private static final long serialVersionUID = -3748972171795581026L;

	static public Pantalla pantalla = null;

	private Shape shape;

	protected void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
		super.paintComponent(g);
	}
	
	protected void paintBorder(Graphics g) {
		g.setColor(getForeground());
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	}
	
	public boolean contains(int x, int y) {
		if (shape == null || !shape.getBounds().equals(getBounds())) {
			shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
		}
		return shape.contains(x, y);
	}

	private Pantalla(){ 
		super(2);
		setOpaque(false); 
		setBackground(new Color(0, 0, 255));
		setEditable(false);
		setFont(new java.awt.Font("Dialog", 1, 18));
	}

	public static Pantalla getDisplay() {
		if (pantalla == null) {
			pantalla = new Pantalla();
		}
		return pantalla;
	}
}
