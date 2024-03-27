package encapsulation;

public class Movie {
    private String name;
    private double durationInMinutes;
    private String director;
    private String releasedYear;
    private long boxOffice;
    private float imdbRating;
    private boolean hasSongs;
    private int noOfAwards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(String releasedYear) {
        this.releasedYear = releasedYear;
    }

    public long getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(long boxOffice) {
        this.boxOffice = boxOffice;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public boolean isHasSongs() {
        return hasSongs;
    }

    public void setHasSongs(boolean hasSongs) {
        this.hasSongs = hasSongs;
    }

    public int getNoOfAwards() {
        return noOfAwards;
    }

    public void setNoOfAwards(int noOfAwards) {
        this.noOfAwards = noOfAwards;
    }
}
