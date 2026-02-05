package footBall;

class Test extends BaseClass{
    
    public static void createTournment( TournamentRegistrationDetails tournamentRegistrationDetails) {
    	
    	 boolean flag=true;
        System.out.println("Enter Tournament name:");
        String name=sc.next();
        tournamentRegistrationDetails.setName(name);
        System.out.println("Enter Tournament place:");
        String place=sc.next();
        tournamentRegistrationDetails.setPlace(place);
        System.out.println("Enter Tournament startDate:");
        String startDate=sc.next();
        tournamentRegistrationDetails.setStartDate(startDate);
        System.out.println("Enter Tournament EndDate:");
        String endDate=sc.next();
        tournamentRegistrationDetails.setEndDate(endDate);
        while (flag) {
            int choice;
            System.out.println("Enter your choice:");
            System.out.println("1) Add Team");
            System.out.println("2) Get Team");
            System.out.println("3) Remove Team");
            System.out.println("4) Change Team Members");
            System.out.println("5) Exit");
            choice=GetChoiceFromUser();
            switch (choice) {
                case 1 -> {
                	String teamName= getTeamNameFromUser();
                	Team team = tournamentRegistrationDetails.getTeam(teamName);
                	if(team==null)
                	{    team=new Team( teamName);
                		if(tournamentRegistrationDetails.teamDetailsObject.teamDetails(team))
                		{	
                			tournamentRegistrationDetails.addTeam(team);
                		}else {
                			System.out.println("Team is Not Added");
                		}
                		
                	}else {
                		System.out.println("Team is Already Exits");
                	}
                }
                case 2 ->{
 
                	Team team =tournamentRegistrationDetails.getTeam( getTeamNameFromUser());
                	if(team==null)
                	{
                		System.out.println("Team is Not Found");
                	}else {
                		team.toString();
                		team.getPlayersList();
                		team.getSupportStaffsList();
                	}
                }
                case 3 ->{
                	Team team =tournamentRegistrationDetails.getTeam( getTeamNameFromUser());
                	if(team==null)
                	{
                		System.out.println("Team is Not Found");
                	}else {
                		tournamentRegistrationDetails.removeTeam(team);
                	}
                }
                case 4 ->{
                	Team team =tournamentRegistrationDetails.getTeam( getTeamNameFromUser());
                	if(team==null)
                	{
                		System.out.println("Team is Not Found");
                	}else {
                		tournamentRegistrationDetails.teamDetailsObject.teamDetails(team);
                	}
                }
                case 5 -> {
                  flag=false;
                }
                default -> System.out.println("Invaild Input");
            }
        }
    }
	public static void main(String[] args) {
		TournamentRegistrationDetails tournamentRegistrationDetails=new TournamentRegistrationDetails();
        createTournment(tournamentRegistrationDetails);
        TournamentSchedule tournamentSchedule= new TournamentSchedule();
        tournamentSchedule.scheduleMatch(tournamentRegistrationDetails);
        System.out.println("Tournament started");
        tournamentRegistrationDetails.startTournamentObject.startTournament(tournamentSchedule);
        
    }

}