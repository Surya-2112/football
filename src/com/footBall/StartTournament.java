package com.footBall;

public class StartTournament extends BaseClass {
	
	public boolean startTournament(TournamentSchedule tournamentSchedule)
	{   int choice;
		System.out.println("Enter your choice for Tournament :");
        System.out.println("1) Start Match");
        System.out.println("2) Match Results");
        System.out.println("3) Points Table");
        System.out.println("4) Next Match");
        System.out.println("5) Change the Match:");
        System.out.println("6) Exits");
        choice=GetChoiceFromUser();
            switch (choice) {
                case 1 -> {
                	Match match=tournamentSchedule.nextMatch();
            		tournamentSchedule.matchDetailsObject.getMatchDetails(match);
                	startMatch(tournamentSchedule,match);
                }
                case 2 -> {
                	
                }
                case 3 ->{
                	
                }
                case 4->{
                	
                }  
                case 5->{
                	
                }
                case 6->{
                	return true;
                }
                default -> System.out.println("Invaild Input");
            }
            return startTournament( tournamentSchedule);
            //TODO : vaild return statement
	}
	
	public void startMatch(TournamentSchedule tournamentSchedule,Match match)
	{
		
		int choice;
		System.out.println("Enter your choice for Match:");
        System.out.println("1) Add Scores");
        System.out.println("2) Match Finshed");
        System.out.println("3) Exits");
        choice=GetChoiceFromUser();
            switch (choice) {
                case 1 -> {
                	tournamentSchedule.matchDetailsObject.addScores(match);
                }
                case 2 -> {
                	
                }
                case 3 ->{
                	
                }
                case 4->{
                	
                }
                case 5->{
                	
                }
                case 6->{
                	return ;
                }
                default -> System.out.println("Invaild Input");
            }
          startMatch(tournamentSchedule,match);
		
	}
}
