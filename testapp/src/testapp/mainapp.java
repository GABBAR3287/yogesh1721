package testapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class mainapp 
{

	public static void main(String args[])
	{
		serializastudent();
		deserializastudent();
	}
	
	private static void deserializastudent()
	{
		FileInputStream fin=null;
		ObjectInputStream oin = null;
		try{
			fin = new FileInputStream(new File("studs.txt"));
			oin = new ObjectInputStream(fin);
			Student s= (Student) oin.readObject();
			System.out.println("--->" + s.getName() + " | Indian" +s.getisIndian());
			} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			try
			{
				fin.close();
				oin.close();
			} 
			catch(IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	private static void serializastudent()
	{
		FileOutputStream fout=null;
		ObjectOutputStream oout=null;
		try
		{
			fout = new FileOutputStream(new File("studs.txt"));
			oout = new ObjectOutputStream(fout);
			Student s= new Student(101, "Omkar gad", false);
			oout.writeObject(s);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				oout.close();
			} 
			catch(IOException e) 
			{
				e.printStackTrace();
			}
			
		}
	}
}
