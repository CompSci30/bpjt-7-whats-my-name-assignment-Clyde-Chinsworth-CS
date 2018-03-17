//What's my Name Project
//17/03/2018
import java.io.*;
import java.util.*;
public class WhatsMyName
{
	public static void main(String args[])
	{
		Scanner kbReader = new Scanner(System.in);
		System.out.print("What is your first name?");
		String name1 = kbReader.next();
		System.out.print("What is your last name?");
		String name2 = kbReader.next();

		System.out.println("Your full name is " + name1 + name2 + "."); 
	}
}
