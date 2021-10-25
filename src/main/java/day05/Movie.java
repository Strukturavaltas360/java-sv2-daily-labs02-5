package day05;

public class Movie {
    private String title;
    private int year;

    private double avgRating;
    private int numberOfVotes;
    private int sumORating;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public double rateMovie (int rating) {
        numberOfVotes ++;
        sumORating += rating;
        avgRating = sumORating*1.0/numberOfVotes;
        return avgRating;
    }

    public String getTitle() {
        return title;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }
}
