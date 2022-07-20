package emailvalidation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailvalidation {
	public static void checkDatabase(String em,String[] ear)
	{
		int flag=0;
		for(int i=0;i<ear.length;i++)
		{
			if(em.equals(ear[i]))
			{
				System.out.println("yaaaa!");
				System.out.println("Your Email ID is Correct.");
				flag=1;
			}
		}
		while(flag==0)
		{
			System.out.println("Oops But Not Present in the Database.");
			break;
		}
	}
	public static void checkValidation(String email,String[] arr)
	{
		System.out.println(email);
		String regex="[a-zA-Z]{1,14}\\@[a-zA-Z]{1,10}\\.[a-z]{1,3}";
		Pattern p=Pattern.compile(regex);
		Matcher n=p.matcher(email);
		if(n.find())
		{
			System.out.println("Your Mail ID: "+email+" is Valid.");
			checkDatabase(email,arr);
		}
		else
		{
			System.out.println("Enter Valid emMail ID.");
		}
	}

	public static void main(String[] args) {
		final String[] employeeEmails= {"aaa@gmail.com","bbb@company.com","ccc@company.com","ddd@company.com","eee@company.com"};
		String ui;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Email ID:");
		ui=in.next();
		checkValidation(ui,employeeEmails);
		in.close();

	}


}
