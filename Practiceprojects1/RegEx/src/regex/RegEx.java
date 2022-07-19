package regex;
import java.util.Scanner;
public class MyRegex {
	String num="(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    String pattern=num + "\\." + num + "\\." + num + "\\." + num;
}

public class RegEx {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the valid IP:");
			while(in.hasNext())
			{
			    String IP= in.next();
			    System.out.println(IP.matches(new MyRegex().pattern));
			}
		}

	}



}
