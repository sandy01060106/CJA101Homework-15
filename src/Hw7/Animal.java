package Hw7;

import java.io.Serializable;

public abstract class Animal implements Serializable{
	private static final long serializableUID = 1L;
	public abstract void speak() ;
}
