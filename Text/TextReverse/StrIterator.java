import java.lang.*;
import java.io.*;
import java.util.*;

class StrIterator{

    public static void main(String[] args){

	String input = "Reverse Using List Iterator";
	char[] charArray = input.toCharArray();
	List<Character> list = new ArrayList<>();

	for(char c : charArray)
	    list.add(c);

	Collections.reverse(list);
	ListIterator it = list.listIterator();

	while(it.hasNext())
	    System.out.print(it.next());
	System.out.print("\n");
    }
}
