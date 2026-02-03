
class Player extends Human {
    
   private  int jerseyNumber;
   private Positions position;
   private int scores;
   private int matchPlayed;

    public Player() {
        this.scores=0;
        this.matchPlayed=0;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(String position) {
       
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }

    public void setMatchPlayed(int matchPlayed) {
        this.matchPlayed = matchPlayed;
    }

}
