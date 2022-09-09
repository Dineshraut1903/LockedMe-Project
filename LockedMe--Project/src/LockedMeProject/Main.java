package lockedMeProject;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		int ch;
		do {
		Methods.displayMenu();
		System.out.println("Enter your choice");
		ch = Integer.parseInt(obj.nextLine());
		switch(ch)
		{
		case 1:Methods.getAllFiles();
		break;
		case 2:Methods.createFiles();
		break;
		case 3:Methods.deleteFiles();
		break;
		case 4:Methods.searchFiles();
		break;
		case 5:Methods.displayMenu();
		break;
		}
		}
		while(ch>0);
		obj.next();
		obj.close();
		
		
	}
	}
	
