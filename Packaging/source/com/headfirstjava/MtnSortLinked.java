package com.headfirstjava;

import javax.swing.*;
import java.util.*;

public class MtnSortLinked{

    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    class NameCompare implements Comparator <Mountain>{
	public int compare(Mountain one, Mountain two){
	    return one.name.compareTo(two.name);
	}
    }

    class HeightCompare implements Comparator <Mountain>{
	public int compare(Mountain one, Mountain two){
	    return (two.height - one.height);
	}
    }

    public static void main(String[] args){
	new MtnSortLinked().go();
    }

    public void go(){
	mtn.add(new Mountain("Longs", 14225));
	mtn.add(new Mountain("Elbert", 14433));
	mtn.add(new Mountain("Maroon", 14156));
	mtn.add(new Mountain("Castle", 14265));
	mtn.add(new Mountain("Chimgan", 13200));

	System.out.println("As entered: \n"+ mtn);
	NameCompare nc = new NameCompare();
	Collections.sort(mtn, nc);
	System.out.println("By name: \n"+ mtn);
	HeightCompare hc = new HeightCompare();
	Collections.sort(mtn, hc);
	System.out.println("By height: \n"+ mtn);
    }
}

class Mountain{

    String name;
    int height;

    Mountain(String n, int h){
	name = n;
	height = h;
    }

    public String toString(){
	return name +" "+ height;
    }
}
