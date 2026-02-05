package com.footBall;
import java.util.ArrayList;
import java.util.List;


class Match{
    private int matchNumber;
    private String matchStartDate;
    private String matchEndDate;
    private String matchStartTime;
    private String matchEndTime;
    private Team team1;
    private Team team2;
    private int team1Score;
    private int team2Score;
    private Statuses status;
    private List<Player> scores;
    private Team winner;
    
    Match()
    {
        this.status=Statuses.NOT_PLAYED;
        this.team1Score=0;
        this.team2Score=0;
        this.matchNumber=0;
        scores=new ArrayList<>();
        winner=null;
    }
    public int getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(int matchNumber) {
        this.matchNumber = matchNumber;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }

    public String getMatchStartDate() {
        return matchStartDate;
    }

    public void setMatchStartDate(String matchStartDate) {
        this.matchStartDate = matchStartDate;
    }

    public String getMatchEndDate() {
        return matchEndDate;
    }

    public void setMatchEndDate(String matchEndDate) {
        this.matchEndDate = matchEndDate;
    }

    public String getMatchEndTime() {
        return matchEndTime;
    }

    public void setMatchEndTime(String matchEndTime) {
        this.matchEndTime = matchEndTime;
    }

    public String getMatchStartTime() {
        return matchStartTime;
    }

    public void setMatchStartTime(String matchStartTime) {
        this.matchStartTime = matchStartTime;
    }

    public Statuses getStatus() {
        return status;
    }
    
    public String getMatchDetails()
    {
    	return toString();
    }
	@Override
	public String toString() {
		return "Match [matchNumber=" + matchNumber + ", matchStartDate=" + matchStartDate + ", matchEndDate="
				+ matchEndDate + ", matchStartTime=" + matchStartTime + ", matchEndTime=" + matchEndTime + ", team1="
				+ team1 + ", team2=" + team2 + ", team1Score=" + team1Score + ", team2Score=" + team2Score + ", status="
				+ status + ", scores=" + scores + "]";
	}
    
}