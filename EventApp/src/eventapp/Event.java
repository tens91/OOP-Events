/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp;

/**
 *
 * @author aenni
 */
public class Event {
    
    //Superclass variables
    String location = new String();
    String date = new String();

    //Constructor
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
