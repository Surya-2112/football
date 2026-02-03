
import java.util.ArrayList;
import java.util.List;

public class Team{
    private String name;
    private List<Player>  players;
    private List<SupportStaff>  supportStaffs;
    private int MatchPlayed;
    private int scored;
    private int wins;
    private int loss;
    private int draws;
    private int goalDifferent;

    Team(String name)
    {   this.name=name;
        this.players=new ArrayList<>();
        this.supportStaffs=new ArrayList<>();
        this. MatchPlayed=0;
        this. scored=0;
        this. wins=0;
        this. loss=0;
        this. draws=0;
        this.goalDifferent=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player addPlayer()
    {
        if(players.size()>=26)
        {
            System.out.println("Team is full");
            return null;
        }else{
            Player player=new Player();
            players.add(player);
            return player;
        }
    }

    public void RemovePlayer(int jerseyNumber)
    { 
        Player player = getPlayer(jerseyNumber);
        if(player==null){
            System.out.print("Player is Not Found");
        }else{
            players.remove(player);
            System.out.print("Player is Remove Successfully");
        }
    }

   public Player getPlayer(int jerseyNumber)
   {
     for(int i=0;i<players.size();i++)
        {
            if(players.get(i).getJerseyNumber()==jerseyNumber)
            {
                return players.get(i);
            }
        }
        return null;
   }
   
   public int getTeamPlayerSize()
   {
    return players.size();
   }

   public int getSupportStaffSize()
   {
     return supportStaffs.size();
   }
    public SupportStaff addSupportStaff()
    {
        SupportStaff supportStaff=new SupportStaff();
        supportStaffs.add(supportStaff);
        return supportStaff;
    }

    public void RemoveSupportStaff(String name ,String role)
    { 
        SupportStaff supportStaff=getSupportStaff(name, role);
        if(supportStaff==null)
        {
            System.out.println("Support Staff Not Found");
        }else{
            supportStaffs.remove(supportStaff);
            System.err.println("Support Staff Removed Successfully");
        }
    }
   public SupportStaff getSupportStaff(String name,String role)
   {
     for(int i=0;i<supportStaffs.size();i++)
        {
            if(supportStaffs.get(i).getName().toUpperCase().equals(name.toUpperCase())
                && supportStaffs.get(i).getRole().toUpperCase().equals(role.toUpperCase()) )
            {
                return supportStaffs.get(i);
            }
        }
        return null;
   }

    public int getMatchPlayed() {
        return MatchPlayed;
    }

    public void setMatchPlayed(int MatchPlayed) {
        this.MatchPlayed = MatchPlayed;
    }

    public int getScored() {
        return scored;
    }

    public void setScored(int scored) {
        this.scored = scored;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getGoalDifferent() {
        return goalDifferent;
    }

    public void setGoalDifferent(int goalDifferent) {
        this.goalDifferent = goalDifferent;
    }
}