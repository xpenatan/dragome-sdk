package com.dragome.compiler.ast;

public class IDHelper {

	public static long ID = 0;

	public static long generateID() {
		long myID = ID;
		ID++;
		return myID;
	}

}
