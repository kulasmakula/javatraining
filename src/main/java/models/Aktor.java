package models;

public class Aktor{
    private String firstName;
    private String lastName;
    private int rating;
    private boolean isOscarPriset;

    public Aktor(String firtName, String lastName, int rating, boolean isOscarPriset) {
        this.firstName = firtName;
        this.lastName = lastName;
        this.rating = rating;
        this.isOscarPriset = isOscarPriset;
    }

    public String getFirtName() {
        return firstName;
    }

    public void setFirtName(String firtName) {
        this.firstName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOscarPriset() {
        return isOscarPriset;
    }

    public void setOscarPriset(boolean oscarPriset) {
        isOscarPriset = oscarPriset;
    }
}
