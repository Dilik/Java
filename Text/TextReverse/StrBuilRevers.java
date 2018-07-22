import java.lang.*;
import java.io.*;
import java.util.*;

class StrBuilRevers{
    public static void main(String[] args){

	String input = "ReverseUsingStringBuilder";

	StringBuilder inputStr = new StringBuilder();

	//append the input to inputStr builder
	inputStr.append(input);

	inputStr = inputStr.reverse();

	System.out.println(inputStr);
    }
}
