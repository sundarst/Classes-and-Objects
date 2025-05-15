package classAndObject;

public class MovieDTO {

    private String movieName;
    private String director;
    private int releaseYear;
    private static String industry = "Bollywood";

    public void showMovieInfo() {
        System.out.println(movieName + " | " + director + " | " + releaseYear);
    }

    public static void showIndustry() {
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        showIndustry();
        MovieDTO m1 = new MovieDTO();
        m1.movieName = "3 Idiots";
        m1.director = "Rajkumar Hirani";
        m1.releaseYear = 2009;
        m1.showMovieInfo();
    }
}
