import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleClient{

    JTextField outgoing;
    JTextArea incoming;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args){
	SimpleClient client = new SimpleClient();
	client.go();
    }

    public void go(){
	
	JFrame frame = new JFrame("Very Simple Client");
	JPanel mainPanel = new JPanel();
	incoming = new JTextArea(15, 50);
	incoming.setLineWrap(true);
	incoming.setWrapStyleWord(true);
	incoming.setEditable(false);
	JScrollPane qScroller = new JScrollPane(incoming);
	qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	outgoing = new JTextField(20);
	JButton sendButton = new JButton("Send");
	sendButton.addActionListener(new SendButtonListener());
	mainPanel.add(qScroller);
	mainPanel.add(outgoing);
	mainPanel.add(sendButton);
	setUpNetwork();

	Thread readerThread = new Thread(new IncomingReader());
	readerThread.start();

	
	frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
	frame.setSize(400,500);
	frame.setVisible(true);
    }

    private void setUpNetwork(){
	try{
	    sock = new Socket("127.0.0.1", 5000);
	    InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
	    reader = new BufferedReader(streamReader);
	    writer = new PrintWriter(sock.getOutputStream());
	    System.out.println("Network established..");
	} catch (IOException ex){
	    ex.printStackTrace();
	}
    }

    public class SendButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent ev){
	    try{
		writer.println(outgoing.getText());
		writer.flush();
	    } catch (Exception ex){
		ex.printStackTrace();
	    }

	    outgoing.setText("");
	    outgoing.requestFocus();
	}// clsoe action
    }//close sendbutton

    public class IncomingReader implements Runnable{
	public void run(){
	    String message;
	    try{

		while((message = reader.readLine()) != null){
		    System.out.println("read " + message);
		    incoming.append(message + "\n");
		}
	    } catch (Exception ex) {ex.printStackTrace();}
	}//close run
    }//close inner class
}//clsoe outer class
