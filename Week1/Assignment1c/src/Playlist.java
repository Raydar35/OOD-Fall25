public interface Playlist {
    String getName();
    void addSong(Song song);
    void removeSong(Song song);
    void playAllSongs();
}
