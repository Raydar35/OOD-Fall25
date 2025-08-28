import java.util.ArrayList;
import java.util.List;

public class PopPlaylist implements Playlist {
    private String name;
    private List<Song> songs;

    // Constructor
    public PopPlaylist(String name) {
        this.name = name + "[Pop]";
        this.songs = new ArrayList<>();
    }

    // Getter for name
    @Override
    public String getName() {
        return name;
    }

    // Method to add song
    @Override
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("'" + song.getTitle() + "' has been added to " + name);
    }

    // Method to remove song
    @Override
    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println("'" + song.getTitle() + "' has been removed from " + name);
    }

    // Method to play songs
    @Override
    public void playAllSongs() {
        System.out.println("Playing playlist: " + name);
        for (Song song : songs) System.out.println("'" + song.getTitle() + "', by " + song.getArtist() + " -" + song.getDuration() + " minutes");
    }
}
