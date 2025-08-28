public class Main {
    public static void main(String[] args) {

        // Created song objects
        Song song1 = new Song("Thriller", "Michael Jackson", 5.9);
        Song song2 = new Song("Somebody That I Used To Know", "Gotye", 4.1);
        Song song3 = new Song("Smells Like Teen Spirit", "Nirvana",4.66);
        Song song4 = new Song("Thunderstruck", "AC/DC", 4.8);


        User user = new User("Hugo123"); // creates a user object

        Playlist rockHard = user.createPlaylist("Rock Hard", "rock"); // Creates a playlist of 'rock' type
        Playlist popBangers = user.createPlaylist("Pop Bangers", "Pop");
        System.out.println();

        popBangers.addSong(song1); // adds song to playlist
        popBangers.addSong(song2);
        System.out.println();

        popBangers.playAllSongs(); // plays the songs in playlist
        System.out.println();

        popBangers.removeSong(song1); // removes a song from playlist
        System.out.println();

        popBangers.playAllSongs();
        System.out.println();

        user.deletePlaylist(rockHard);
    }
}