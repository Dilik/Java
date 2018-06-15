import java.util.*;
import java.io.*;
import java.text.*;

public class heartRate{
    String fname;
    String lname;
    Integer age;
    Integer dd;
    Integer mm;
    Integer yy;
    Integer height;
    double weight;
    char gender;
    Date date = new Date();

    public heartRate(){
	fname = null;
	lname = null;
	dd = mm = yy = null;
    }

    public heartRate(String firstname, String lastname,
		     Integer date, Integer month, Integer year,
		     Integer hght, double wght, char gdr, Integer age1){
	fname = firstname;
	lname = lastname;
	dd = date;
	mm = month;
	yy = year;
	age = age1;
	height = hght;
	weight = wght;
	gender = gdr;
	
    }

    public void setFullname(String firstname, String lastname){
	fname = firstname;
	lname = lastname;
    }
    public void setDOB(Integer date, Integer month, Integer year){
	dd = date;
	mm = month;
	yy = year;
    }
    public void setGender(char g){
	if(g == 'M' || g == 'm' || g=='F' || g=='f'){
	    gender = g;
	}else{
	    System.out.println("Gender for female should be F or M for male");
	}
    }
    public void setAge(Integer mAge){
	age = mAge;
    }
    public void setHTandWT(Integer hght, double wght){
	height = hght;
	weight = wght;
    }
    public char getGender(){
	return gender;
    }
    public Integer getAge(){
	return age;
    }
    public String getFullname(){
	return fname + " " + lname + "\n";
    }

    public String  getDOB(){
	return Integer.toString(dd) + "/"+Integer.toString(mm)+"/"+Integer.toString(yy)+"\n";
    }

    public Integer maxHeartRate(){
	return 220 -getAge();
    }
    public double getWeight(){
	return weight;
    }

    public Integer getHeight(){
	return height;
    }

    public void curDate(){
	SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
	System.out.println("Current Date:   " + dateFormatter.format(date) + "\n");;
    }

    public void targetHeartRate(){
	Integer  max = (maxHeartRate()*85)/100;
	Integer  min = (maxHeartRate()*50)/100;

	System.out.println("Maximum heart rate: "+maxHeartRate()+"\n");
	System.out.println("Targeted heart rate: \n");
	System.out.println("Minimum: " + min + "\n"+ "Maximum: " + max + "\n");
    }

    public void calcBMI(){
	double bmi = 0;
	bmi = (getWeight() * 703) / (getHeight() * getHeight());
	System.out.println("BMI: " + bmi);
	System.out.print("BMI Status: ");
	if(bmi < 18.5){
	    System.out.println("Underweight \n");
	}else if(bmi > 18.5 && bmi < 24.9){
	    System.out.println("Normal \n");
	}
	else if(bmi > 25 && bmi < 29.9){
	    System.out.println("Overweight \n");
	}
	else if(bmi > 30){
	    System.out.println("Obese \n");
	}
    }
    
    public void printInfo(){
	System.out.println("----------------Personal Info ------------------\n");
	curDate();
	System.out.println("Name: " + getFullname() + "\n");
	System.out.println("DOB: " + getDOB() + "\n");
	System.out.println("Age: " + getAge() + "\n");
	System.out.println("Gender: " + getGender() + "\n");
	System.out.println("-------------Patient health info------------------\n");
	targetHeartRate();
	calcBMI();
	System.out.println("---------------------------------------------\n");

	    
    }

    public static void main(String[] args){
	heartRate Makhamed = new heartRate();
	Makhamed.setFullname("Dilmurod","Makhamadaliev");
	Makhamed.setDOB(7,9,1989);
	Makhamed.setAge(27);
	Makhamed.setGender('M');
	Makhamed.setHTandWT(72, 170.5);
	Makhamed.printInfo();

	heartRate Eklas = new heartRate("Eklasur", "Akanda", 25, 11, 1983, 64, 120,'F', 33);
	Eklas.printInfo();
    }
}
