/**
 * A movie in an online movie catalog
 * 
 * @author Cara Tang and Alireza Barzin Zanganeh        
 * @version 10/09/16       
 *  Modifications:
 *	Add second constructor that take two parameters (title and run length) and as the default
 *	    set star Rating of the movie to 0
 *  Add accessor (get method) to return star rating information about object
 *  Add mutator (set method) to set starRating variable to a given parameter
 *  Fix increaseStarRating method to increase star rate by one, if it not at maximum rate.
 *  Add a mutator to decrease star rate, if it is not at minimum rate. 
 *  Add a line to the printMovieInfo to print star rating of the movie, too.
 *                        
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
        starRating = aStarRating;
    }

    /**
     * Create a movie with the title, run length and give it zero star rate as default
     */
    public Movie(String myTitle, int myRunLength)
    {
        title = myTitle;
        runLength = myRunLength;
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
     * Return the star rating of the movie
     */
    public int getStarRating()
    {
        return starRating;
    }
    
    /**
     * Set the star rating of this movie to the given rate, taken as a parameter between 1 to 4 
     */
    public void setStarRating(int newStarRate)
    {
        if (newStarRate>0 && newStarRate<5) {
            starRating = newStarRate;
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
     * Increase the star rating of this movie by 1
     */
    public void increaseStarRating()
    {
        if (starRating<4) {
            starRating = starRating + 1;
        }
        else {
            System.out.println("The star rate is maximum. It can not be increased.");
        }   
    }
    
    /**
     * Decrease the star rating of this movie by 1
     */
    public void decreaseStarRating()
    {
        if (starRating>1) {
            starRating = starRating - 1;
        }
        else {
            System.out.println("The star rate is minimum. It can not be decreased.");
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
        System.out.println("Star rating: " + starRating);
        System.out.println("---------------------------------");
    }
}
