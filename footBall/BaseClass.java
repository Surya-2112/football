package footBall;

import java.util.Scanner;

public class BaseClass {
	 //TODO : need Valid User Input
	
static Scanner sc=new Scanner(System.in);
    
    public static int GetChoiceFromUser()
    {
    	int n=sc.nextInt();
    	return n;
    }
    
    public static String getTeamNameFromUser( )
    {    System.out.println("Enter a Team Name");
    	 String teamName=sc.next();
    	 return teamName;
    }
    
    public static String getHumanNameFromUser()
    {
    	System.out.println("Enter the Name");
        String name=sc.next();
        return name;
    }
    
    public static int getHumanAgeFromUser()
    {
    	 System.out.println("Enter the Age");
         int age=sc.nextInt();
         return age;
    }
    public static String getHumanGenderFromUser()
    {
    	 System.out.println("Enter the Gender");
         String gender=sc.next();
         return gender;
    }
    public static String getHumanMobileNumberFromUser()
    {
    	  System.out.println("Enter the  MoblieNumber");
          String moblieNumber=sc.next();
         return moblieNumber;
    }
    public static String getHumanEmailFromUser()
    {
    	 System.out.println("Enter the EMail");
         String eMail=sc.next();
         return eMail;
    }
    public static int getPlayerJerseyNumberFromUser()
    {
    	 System.out.println("Enter the JerseyNumber");
         int jerseyNumber=sc.nextInt();
         return jerseyNumber;
    }
    public static String getPlayerPositionsFromUser()
    {
    	System.out.println("Enter the Position in two letters");
        String position=sc.next();
         return position;
    }
    public static String getSupportStaffRoleFromUser()
    {
    	System.out.println("Enter the Role");
        String role=sc.next();
         return role;
    }
}
