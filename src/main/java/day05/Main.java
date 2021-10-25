package day05;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 1987);
        Viewer viewer = new Viewer();

        viewer.watchMovie(movie, 8);
        viewer.watchMovie(movie, 10);
        viewer.watchMovie(movie, 2);
        viewer.watchMovie(movie, 5);

    }
}
