import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class myFrame extends JFrame{

    JLabel l;
    
    public void start(){
	
	l = new JLabel();
	l.setText("  Name: ");
	JTextField txt = new JTextField("Username here");

	JPasswordField pass = new JPasswordField(10);
	JButton but = new JButton();

	but.setText("Submit");

	add(l);
	add(txt);
	add(pass);
	add(but);

	but.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		 

		    JFrame newWin = new JFrame("This is new frame");
		    JLabel ll = new JLabel("Welcom to JAVA Class !!! YOU just Logged In", SwingConstants.CENTER);
		    newWin.add(ll);
		    newWin.setSize(400,400);
		    newWin.setVisible(true);
		    l.setText("Button Clicked");			
		}
	    });

	setLayout(new FlowLayout());
	setSize(400,400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
    }

    public static void main(String[] args){
	new myFrame().start();
    }
}
