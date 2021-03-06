import javax.swing.*;
import java.awt.*;

class Graph2D extends JPanel{

    public void paintComponent(Graphics g){

	Graphics2D g2d = (Graphics2D) g;
	
	int red = (int) (Math.random() * 255);
	int green = (int) (Math.random() * 255);
	int blue = (int) (Math.random() * 255);
	Color startCol = new Color(red, green, blue);

	
	red = (int) (Math.random() * 255);
	green = (int) (Math.random() * 255);
	blue = (int) (Math.random() * 255);
	Color endCol = new Color(red, green, blue);
	
	GradientPaint gradient = new GradientPaint(70,70, startCol, 150, 150, endCol);
	g2d.setPaint(gradient);
	g2d.fillOval(70,70,100,100);
	g2d.rotate(Math.toRadians(80));

    }

    public static void main(String[] args){

	Graph2D g2d = new Graph2D ();
	JFrame frame = new JFrame ();

	frame.getContentPane().add(g2d);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,300);
	frame.setVisible(true);
    }
}
