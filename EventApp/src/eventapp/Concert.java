package eventapp;

public class Concert extends Event {

    private String headline, support;
    String name;

    public Concert(String location, String date) {
        super(location, date);
        this.headline = headline;
        this.support = support;

        name = headline + " featurinng: " + support;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getName() {
        return name;
    }
}
