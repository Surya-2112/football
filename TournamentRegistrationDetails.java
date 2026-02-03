import java.util.List;

class TournamentRegistrationDetails{
    public static AddingTeamDetails addingTeamDetails=new AddingTeamDetails();
    private String name;
    private String place;
    private String StartDate;
    private String EndDate;
    private List<Team> teams;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }
    public Team addTeam(String name)
    {
        Team team=new Team(name);
       if(addingTeamDetails.addingDetails(team)){
        teams.add(team);
        System.out.println("Team added Successfully");
       }else{
         System.out.println("Team Not added");
       }
       return team;
    }
    public void removeTeam(String name)
    {   Team team=getTeam(name);
        if(team==null)
        {
            System.out.println("Team name is not found");
        }else{
            teams.remove(team);
            System.out.println("Team is removed");
        }

    }

    public Team getTeam(String name)
    {
        for(int i=0;i<teams.size();i++)
        {
            if(teams.get(i).getName().toUpperCase().equals(name.toUpperCase()))
            {
                return teams.get(i);
            }
        }
        return null;
    }
}