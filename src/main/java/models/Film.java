package models;
public class Film {
    private String title;
    private int rating;
    private char category;
    private double budget;

    public Film(String title, int rating, char category, double budget) {
        this.title = title;
        this.rating = rating;
        this.category = category;
        this.budget = budget;
    }

    public Film() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}
