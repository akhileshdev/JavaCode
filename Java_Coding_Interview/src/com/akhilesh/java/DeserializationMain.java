package com.akhilesh.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationMain 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		// TODO Auto-generated method stub
       
		
		FileInputStream fin = new FileInputStream("E:\\student.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		
		StudentSerialization st = (StudentSerialization)in.readObject();
		
		System.out.println("Student ID : "+st.id+" Name : "+st.name+" Age : "+st.age);
		
		
		
		
	}

}
