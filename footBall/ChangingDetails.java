package footBall;

public class ChangingDetails extends BaseClass{
	//TODO : need Valid return statement
	public static boolean changingPlayersDetails(Player player)
	{
		int choice;
        System.out.println("Enter your choice for Changing Player Details:");
        System.out.println("1) Player Name");
        System.out.println("2) Player Age");
        System.out.println("3) Player Gender");
        System.out.println("4) Player MobileNumber");
        System.out.println("5) Player e-Mail");
        System.out.println("6) Player  JerseyNumber");
        System.out.println("7) Player Position");
        System.out.println("8) Exit");
        choice=GetChoiceFromUser();
        switch (choice) {
        case 1 -> {
           player.setName(getHumanNameFromUser());
        }
        case 2 -> {
        	player.setAge(getHumanAgeFromUser());
        }
        case 3 ->{
        	player.setGender(getHumanGenderFromUser());
        }
        case 4->{
        	player.setMobileNumber(getHumanMobileNumberFromUser());
        }
        case 5->{
        	player.setEMail(getHumanEmailFromUser());
        }
        case 6->{
        	player.setJerseyNumber(getPlayerJerseyNumberFromUser());
        }
        case 7->{
        	player.setPosition(getPlayerPositionsFromUser());
        }
        case 8->{
        	return true;
        }
        default -> System.out.println("Invaild Input");
    }
   return changingPlayersDetails(player);
	}
	public static boolean changingSupportStaffDetails(SupportStaff supportstaff)
	{
		int choice;
        System.out.println("Enter your choice for Changing SupportStaff Details:");
        System.out.println("1) SupportStaffr Name");
        System.out.println("2) SupportStaff Age");
        System.out.println("3) SupportStaff Gender");
        System.out.println("4) SupportStaff MobileNumber");
        System.out.println("5) SupportStaff e-Mail");
        System.out.println("6) SupportStaff  Role");
        System.out.println("7) Exit");
        choice=GetChoiceFromUser();
        switch (choice) {
        case 1 -> {
        	supportstaff.setName(getHumanNameFromUser());
        }
        case 2 -> {
        	supportstaff.setAge(getHumanAgeFromUser());
        }
        case 3 ->{
        	supportstaff.setGender(getHumanGenderFromUser());
        }
        case 4->{
        	supportstaff.setMobileNumber(getHumanMobileNumberFromUser());
        }
        case 5->{
        	supportstaff.setEMail(getHumanEmailFromUser());
        }
        case 6->{
        	supportstaff.setRole(getSupportStaffRoleFromUser());
        }
        case 7->{
        	return true;
        }
        default -> System.out.println("Invaild Input");
    }
   return changingSupportStaffDetails(supportstaff);
	}
}
