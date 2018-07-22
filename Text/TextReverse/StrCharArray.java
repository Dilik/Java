import java.io.*;
import java.lang.*;
import java.util.*;

class StrCharArray{

    public static void main(String[] args){

	String input = "ReverseUsingCharArray";

	char[] charArray = input.toCharArray();

	for(int i=charArray.length-1; i>=0; i--)
	    System.out.print(charArray[i]);
	System.out.println("\n");
    }
}
