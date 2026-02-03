import java.util.ArrayList;
import java.util.List;


class TournamentSchedule{
    private List<Match> matches;

    TournamentSchedule()
    {
        matches=new ArrayList<>();
    }
    public void addMatches()
    {
        Match match=new Match();
        matches.add(match);
        System.out.println("Match is added Successfully");
    }

    
}