import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Playlist> playlists;

    // Constructor
    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    // Method to create a playlist
    public Playlist createPlaylist(String name, String type) {
        Playlist playlist; // creates a Playlist variable type

        switch (type.toLowerCase()) { // toLowerCase() helps avoid capitalization issues
            case "pop":
                playlist = new PopPlaylist(name); // creates PopPlaylist object
                break;
            case "rock":
                playlist = new RockPlaylist(name);
                break;
            case "jazz":
                playlist = new JazzPlaylist(name);
                break;
            default:
                System.out.println("Invalid playlist type.");
                return null; // Exits out of method
        }

        playlists.add(playlist); // adds the created object to the playlists List
        System.out.println("Created '" + name + "' playlist.");
        return playlist;
    }

    // Method to delete a playlist
    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
        System.out.println("Deleted '" + playlist.getName() + "' playlist.");
    }

    // Method to add song to a playlist
    public void addSongToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
    }

    // Method to remove song from a playlist
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
    }
}
