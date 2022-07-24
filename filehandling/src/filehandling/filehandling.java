package filehandling;
import java.io.*;
import java.util.Scanner;

public class filehandling {
	public static void main(String args[]) {
	try {
		File obj = new File("C:\\filehandling\\test.txt");
		if(obj.createNewFile()) {
			System.out.println("FileCreated " +obj.getName());
		}else {
			System.out.println("Already file exists");
		}
	}
		catch (Exception e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	try {
		FileWriter writer = new FileWriter("C:\\filehandling\\test.txt");
		writer.write("HELLO JAVA");
		writer.close();
		System.out.println("written successfully in the file");
		}catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
			}
	
	try {
		File obj = new File("C:\\filehandling\\test.txt");
		Scanner myReader = new Scanner(obj);
		while(myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println("Reading from File: ");
			System.out.println(data);
		}
		myReader.close();
	}
	catch(Exception u) {
		System.out.println("Exception occured");
		u.printStackTrace();	
	}
	}

}
