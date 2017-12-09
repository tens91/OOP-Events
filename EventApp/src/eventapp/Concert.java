
package eventapp;


public class Concert extends Event {
    
    private String headline, support, name;
 
    public Concert(String location, String date){
        super(location, date);
        this.name = name;
    }

    public void setName(String name) {
        this.name = headline +" vs. "+support;
    }

    public String getName() {
        return name;
    }
}