
package eventapp;

/**
 *
 * @author aenni
 */
public class Event {
    
    //Superclass variables
    private String location, date;

    //Constructor
    public Event() {
        location = new String();
        date = new String();
    }

    public Event(String location, String date) {
        this.location = location;
        this.date = date;
    }
    
    //Getters
    public String getLocation() {
        return location;
    }
    public String getDate() {
        return date;
    }
    
    //Setters
    public void setLocation(String location) {
        this.location = location;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
