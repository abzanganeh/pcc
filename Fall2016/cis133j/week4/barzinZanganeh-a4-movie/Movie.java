/**
 * A movie in an online movie catalog
 * 
 * @author Cara Tang and Alireza Barzin Zanganeh         
 * @version 10/23/16
 * 
 * A2 Modifications:
 * - add second constructor
 * - add getStarRating
 * - add setStarRating
 * - fix increaseStarRating
 * - add decreaseStarRating
 * - update printMovieInfo
 * A4 Modifications:
 * use an internal method call to update starRating field in constructor.
 * add a validation check to the setStarRating method.
 * add a validation check to increaseStarRating method to avoid adding more than rate 4.
 * add a validation check to decreaseStarRating method to avoid decreasing less than rate 1.
 * add a option to print movie info in case rating 0: (not rating)
   */
  
public class Movie
{
    private String title;
    private int runLength;  // length of the movie in minutes
    private int starRating; // rating from 1 to 4 stars (0 = not rated yet)

    /**
     * Create a movie with the title, run length, and number of stars given
     */
    public Movie(String aTitle, int aRunLength, int aStarRating)
    {
        title = aTitle;
        runLength = aRunLength;
        setStarRating(aStarRating);
        // Question: Why do you think we want to replace the assignment statement with a call to setStarRating?
        // Your Answer:We call this way Internal Method Call because they are in a same class. We do it to update starRating filed.
    }

    /**
     * Create a movie with the title and run length given
     */
    public Movie(String aTitle, int aRunLength)
    {
        title = aTitle;
        runLength = aRunLength;
        starRating = 0;
    }

    /**
     * Return the title of the movie
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the run length of the movie
     */
    public int getRunLength()
    {
        return runLength;
    }
    
    /** 
     * Return the rating in stars of the movie
     */
    public int getStarRating()
    {
        return starRating;
    }
    
    /**
     * Set the star rating of this movie to the given rate if the parameter is between 1 to 4.
     */
    public void setStarRating(int newRating)
    {
        if (newRating>0 && newRating<5) {
            starRating = newRating;
        }
        else {
            System.out.println("Please enter a valid star rating between 1 to 4 ");
        }    
    }

    /**
     * Reset the star rating of this movie to 0, meaning not rated
     */
    public void resetStarRating()
    {
        starRating = 0;
    }
    
    /**
     * Increase the star rating of this movie by 1 if the starRating is not at max value.
     */
    public void increaseStarRating()
    {
        if (starRating<4) {
            starRating = starRating + 1;
        }
    }

    /**
     * Decrease the star rating of this movie by 1 if the starRating is not at min value or 0.
     */
    public void decreaseStarRating()
    {
        if (starRating>1) {
            starRating = starRating - 1;
        }
    }

    /**
     * Print information on this movie
     */
    public void printMovieInfo()
    {
        System.out.println("---------------------------------");
        System.out.println(title);
        System.out.println("Run length: " + runLength);
        if (starRating==0){
            System.out.println("Rating: (no rating)");
        }
        else{
            System.out.println("Rating: " + starRating + " stars");
        }
        System.out.println("---------------------------------");
    }
}
