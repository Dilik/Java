import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class checkbox implements ItemListener{

    JTextArea text;
    JCheckBox check;
    
    public static void main(String[] args){
	checkbox gui = new checkbox();
	gui.go();
    }

    public void go(){

	check  = new JCheckBox("Relationship");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	text = new JTextArea(10, 20);
	check.addItemListener(this);
	check.setSelected(true);
	text.setLineWrap(true);

	JScrollPane scroller = new JScrollPane (text);
	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

	panel.add(scroller);
	frame.getContentPane().add(BorderLayout.CENTER, panel);
	frame.getContentPane().add(BorderLayout.NORTH, check);

	frame.setSize(350, 350);
	frame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ev){
	String onOrOff = "off";
	if(check.isSelected()) 
	text.append("CheckBox checked \n");
    }
}
