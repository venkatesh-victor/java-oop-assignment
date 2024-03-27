package polymorphism;

class Movie {
    protected String movieName;
    protected String protaganist;
    protected String directedBy;
    protected float runTimeInMinutes;

    public Movie(String movieName, String protaganist, String directedBy,
                float runTimeInMinutes)
    {
        this.movieName = movieName;
        this.protaganist = protaganist;
        this.directedBy = directedBy;
        this.runTimeInMinutes = runTimeInMinutes;
    }

    public void movieDetails() {
        System.out.println("Name: " + movieName);
        System.out.println("Lead Actor: " + protaganist);
        System.out.println("Director: " + directedBy);
        System.out.println("Total Run Time: " + runTimeInMinutes + " minutes");
    }
}

class RomComMovie extends Movie {
    private String genre;

    public RomComMovie(String movieName, String protaganist, String directedBy,
                       float runTimeInMinutes, String genre)
    {
        super(movieName, protaganist, directedBy, runTimeInMinutes);
        this.genre = genre;
    }
    public void movieDetails()
    {
        super.movieDetails();
        System.out.println("Movie Genre: " + genre);
    }
}

class ThrillerMovie extends Movie {
    private String genre;

    public ThrillerMovie(String movieName, String protaganist, String directedBy,
                       float runTimeInMinutes, String genre)
    {
        super(movieName, protaganist, directedBy, runTimeInMinutes);
        this.genre = genre;
    }

    public void movieDetails()
    {
        super.movieDetails();
        System.out.println("Movie Genre: " + genre);
    }
}

class ActionMovie extends Movie {
    private String genre;

    public ActionMovie(String movieName, String protaganist, String directedBy,
                       float runTimeInMinutes, String genre)
    {
        super(movieName, protaganist, directedBy, runTimeInMinutes);
        this.genre = genre;
    }
}

class ComedyMovie extends Movie {
    private String genre;

    public ComedyMovie(String movieName, String protaganist, String directedBy,
                       float runTimeInMinutes, String genre)
    {
        super(movieName, protaganist, directedBy, runTimeInMinutes);
        this.genre = genre;
    }

    public void movieDetails()
    {
        super.movieDetails();
        System.out.println("Movie Genre: " + genre);
    }
}

public class MovieDemo {
    public static void main(String[] args) {
        Movie actionMovie = new ActionMovie("Batman", "Robert Pattinson",
                "Matt Reeves", 183, "Action");
        Movie romComMovie = new RomComMovie("La La Land", "Ryan Gosling",
                "Damian Chazzelle", 143, "Romance");
        Movie comedyMovie = new ComedyMovie("The great Dictator", "Charlie Chaplin",
                "Charlie Chaplin", 164, "Comedy");

        actionMovie.movieDetails();
        System.out.println();
        romComMovie.movieDetails();
        System.out.println();
        comedyMovie.movieDetails();
    }

}
