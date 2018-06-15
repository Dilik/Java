import javax.swing.*;
import java.awt.*;

public class BorderLO {

    public static void main(String[] args){
	BorderLO gui = new BorderLO();
	gui.go();
    }

    public void go(){

	JFrame frame = new JFrame();
	JButton button = new JButton("click me.......................");
	JButton buttonS = new JButton("South");
	JButton buttonW = new JButton("West");
	JButton buttonN = new JButton("North");
	JButton buttonC = new JButton("Center");
	Font bigFont = new Font("serif", Font.BOLD, 28);

	
	buttonS.setFont(bigFont);
	buttonW.setFont(bigFont);
	buttonN.setFont(bigFont);
	buttonC.setFont(bigFont);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(BorderLayout.EAST, button);
	frame.getContentPane().add(BorderLayout.SOUTH, buttonS);
	frame.getContentPane().add(BorderLayout.WEST, buttonW);
        frame.getContentPane().add(BorderLayout.NORTH, buttonN);
	frame.getContentPane().add(BorderLayout.CENTER, buttonC);
	frame.setSize(200,200);
	frame.setVisible(true);
	
    }
    
}
