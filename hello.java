import java.io.*;
import java.util.Scanner;

public class hello{

    //Main function
    public static void main(String[] args){
	scan();		
    }

    //scan users input
    public static void scan(){
	Scanner name = new Scanner(System.in);
	Scanner age = new Scanner(System.in);
	Scanner addrs = new Scanner(System.in);
	Scanner email = new Scanner(System.in);
	Scanner cellp = new Scanner (System.in);

	System.out.println("Enter your name");
	String name1 = name.nextLine();
	System.out.println("Enter your age");
	int age1 = age.nextInt();
	System.out.println("Enter your address");
	String addrs1 = addrs.nextLine();
	System.out.println("Enter your email");
	String email1 = email.nextLine();
	System.out.println("Enter your CellPhone");
	String cell1 = cellp.nextLine();

        print(name1,age1,addrs1, cell1, email1);

    }

    //print users information
    public static void print(String fname, int age, String address, String CPhone, String email){
	
	    System.out.println("-----------Person's Inforamtion---------\n");
	    System.out.println("Name: "+fname+"\n"+
			       "Age: "+age+"\n"+
			       "Address: "+ address+"\n"+
			       "Cell Phone: "+CPhone+"\n"+
			       "Email: "+email+"\n");
	    System.out.println("------------------------------------------");
    }
   
}
