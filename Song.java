/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?

    private String title;
    private String artist;
    private int durationSeconds; // store duration in total seconds
    private boolean liked;


    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */

    public Song(String title, String artist, int minutes, int seconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = minutes * 60 + seconds;
        this.liked = false;
    }



     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

     public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isLiked() {
        return liked;
    }

    // Mutators
    public void like() {
        liked = true;
    }

    public void unlike() {
        liked = false;
    }

    // Helper: duration string m:ss


    /**
     * toString for printing in playlist
     */
}
