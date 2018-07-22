import java.lang.*;
import java.io.*;
import java.util.*;

class ByteReverse{
    public static void main(String[] args){

	String input = "ReverseUsingByteMethod";

	//convert string into bytes using getBytes method
	byte [] strByteArray = input.getBytes();

	byte [] result = new byte [strByteArray.length];

	//reverse the result and put back into result array

	for(int i=0; i<strByteArray.length; i++)
	  result[i] = strByteArray[strByteArray.length-i-1];

	System.out.println(new String(result));
    }
}
