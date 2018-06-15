import javax.swing.*;
import java.awt.*;

public class Anim {

    int x = 240;
    int y = 20;

    public static void main(String[] args){
	Anim anim = new Anim();
	anim.go();
    }

    public void go() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	MyDrawPanel drawPanel = new MyDrawPanel();

	frame.getContentPane().add(drawPanel);
	frame.setSize(300,300);
	frame.setVisible(true);

	for(int i=0; i< 180; i++){
	    x--;
	    y++;

	    drawPanel.repaint();

	    try{
		Thread.sleep(15);		
	    } catch (Exception ex){}
	}
    }

    class MyDrawPanel extends JPanel{

	public void paintComponent(Graphics g){

	    int red = (int) (Math.random() * 255);
	    int green = (int) (Math.random() * 255);
	    int blue = (int) (Math.random() * 255);

	    Color rCol = new Color(red, green, blue); 

	    g.setColor(Color.white);
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    g.setColor(rCol);
	    g.fillOval(x,y,40,40);
	}
    }
}
