import java.util.Scanner;

class Test{
    static Scanner sc=new Scanner(System.in);
    public static void teamDetails(Team team)
    {   
        while(true){
        int choice;
        System.out.println("Enter your choice for Team Details:");
        System.out.println("1) Add Players");
        System.out.println("2) Add supportStaffs");
        System.out.println("3) Exit");
        choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    addPlayerDetails(team);
                }
                case 2 -> {
                }
                default -> System.out.println("Invaild Input");
            }
        }
       
    }
    public static void HumanDetails(Human human) {
        System.out.println("Enter the Name");
        String name=sc.next();
        human.setName(name);
        System.out.println("Enter the Age");
        int age=sc.nextInt();
        human.setAge(age);
        System.out.println("Enter the Gender");
        String gender=sc.next();
        human.setName(gender);
        System.out.println("Enter the  MoblieNumber");
        String moblieNumber=sc.next();
        human.setName(moblieNumber);
        System.out.println("Enter the EMail");
        String eMail=sc.next();
        human.setName(eMail);
    }
    public static void addPlayerDetails(Team team)
    {
        Player player=team.addPlayer();
        HumanDetails(player);
        System.out.println("Enter the JerseyNumber");
        int jerseyNumber=sc.nextInt();
        player.setJerseyNumber(jerseyNumber);
        System.out.println("Enter the Position");
        String position=sc.next();
        team.setName(position);
        
    }
    public static void createTournment() {
        System.out.println("Start the Tournament");
        TournamentRegistrationDetails tournamentRegistrationDetails=new TournamentRegistrationDetails();
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
        while (true) {
            int choice;
            System.out.println("Enter your choice:");
            System.out.println("1) Add Team");
            System.out.println("2) Exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter a Team Name");
                    String teamName=sc.next();
                    Team team =tournamentRegistrationDetails.addTeam(teamName);
                    teamDetails(team);
                }
                case 2 -> {
                    break;
                }
                default -> System.out.println("Invaild Input");
            }
        }
    }
    public static void main(String[] args) {
      
        createTournment();
    }

}