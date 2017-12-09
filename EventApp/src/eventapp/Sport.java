
package eventapp;

public class Sport extends Event {

    private String team1, team2, name;
    
    public Sport(String location, String date){
        super(location, date);
        this.name = name;
    }
    
    public void setName(String name){
        name = team1 +" vs. "+team2;
    }
    
    public void getName(){
        return name;
    }
}