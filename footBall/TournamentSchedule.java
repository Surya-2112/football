package footBall;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class TournamentSchedule{
    private List<Match> matches;
    private int  matchCompleted;

    TournamentSchedule()
    {
        matches=new ArrayList<>();
        matchCompleted=0;
    }
    
    public String matchDetails(int MatchNumber)
    {
    	return matches.get(MatchNumber-1).getMatchDetails();
    }
    
    public Match nextMatch()
    {   if(matchCompleted<matches.size())
    	{
    		return 
    	}else
    	return null;
    }
    
    
    public void scheduleMatch(TournamentRegistrationDetails tournamentRegistrationDetails)
    {
    	 int NumberOfTeam=tournamentRegistrationDetails.getTeamList().size();
    	 
    	 for(int i=0;i<NumberOfTeam;i++)
    	 {
    		 for(int j =i +1 ;j<NumberOfTeam ;j++)
    		 {
    			 Match match=new Match();
    			 match.setTeam1(tournamentRegistrationDetails.getTeamList().get(i));
    			 match.setTeam2(tournamentRegistrationDetails.getTeamList().get(j));
    			 matches.add(match);
    		 }
    	 }
    	 Collections.shuffle(matches);
    	 setMatchNumbers(matches);
    }
    public void setMatchNumbers(List<Match> matches)
    {
    	for(int i=0;i<matches.size();i++)
    	{
    		matches.get(i).setMatchNumber(i+1);
    	}
    }
    
}