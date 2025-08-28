import java.util.ArrayList;
import java.util.List;

public class Playlist {
    protected String name;
    protected List<Song> songs;

    // Constructor
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to add song
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("'" + song.getTitle() + "' has been added to " + name);
    }

    // Method to remove song
    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println("'" + song.getTitle() + "' has been removed from " + name);
    }

    // Method to play songs
    public void playAllSongs() {
        System.out.println("Playing playlist: " + name);
        for (Song song : songs) System.out.println("'" + song.getTitle() + "', by " + song.getArtist() + " -" + song.getDuration() + " minutes");
    }
}
