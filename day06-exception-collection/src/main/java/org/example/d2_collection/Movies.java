package org.example.d2_collection;

public class Movies {
    String MovieName;
    String MovieActor;
    double MoviePrice;

    public Movies() {
    }

    public Movies(String movieName, String movieActor, double moviePrice) {
        MovieName = movieName;
        MovieActor = movieActor;
        MoviePrice = moviePrice;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieActor() {
        return MovieActor;
    }

    public void setMovieActor(String movieActor) {
        MovieActor = movieActor;
    }

    public double getMoviePrice() {
        return MoviePrice;
    }

    public void setMoviePrice(double moviePrice) {
        MoviePrice = moviePrice;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "MovieName='" + MovieName + '\'' +
                ", MovieActor='" + MovieActor + '\'' +
                ", MoviePrice=" + MoviePrice +
                '}';
    }
}
