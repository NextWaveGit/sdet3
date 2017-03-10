package com.fanniemae.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStoreGet {

	public static void storeObject(Customer cust) {
		File f = new File("cust.ser");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(cust);
			oos.writeObject(12346);
	//		oos.writeInt(2344);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				// oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("written");

	}

	public static void getObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cust.ser"));

		Customer cust = (Customer) ois.readObject();
		System.out.println(cust);

		System.out.println(ois.readObject());
		
//		System.out.println(ois.readInt());
		ois.close();

	}

	public static void main(String args[]) throws FileNotFoundException, ClassNotFoundException, IOException {
		Customer cust = new Customer();
		cust.setCustName("Lee");
		cust.setCutId(123);

		storeObject(cust);
		getObject();

	}

}
