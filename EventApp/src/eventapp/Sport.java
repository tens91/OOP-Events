package eventapp;

public class Sport extends Event {

    private String team1, team2;
    String name;

    public Sport(String location, String date) {
        super(location, date);
        this.team1 = team1;
        this.team2 = team2;
        name = team1 + " featurinng: " + team2;
    }

    Sport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getName() {
        return name;
    }
}
