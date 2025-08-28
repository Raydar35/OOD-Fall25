import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Song> allSongs = new ArrayList<>();

        // Created pop songs
        Song song1 = new Song("Thriller", "Michael Jackson", 05.58, "pop", "spooky");
        allSongs.add(song1);
        Song song2 = new Song("Somebody That I Used To Know", "Gotye", 04.04, "pop", "sad");
        allSongs.add(song2);
        Song song3 = new Song("Happy", "Pharrell Williams", 03.53, "pop", "happy");
        allSongs.add(song3);
        Song song4 = new Song("24K Magic", "Bruno Mars", 03.46, "pop", "happy");
        allSongs.add(song4);
        Song song5 = new Song("Believer", "Imagine Dragons", 03.37, "pop", "intense");
        allSongs.add(song5);

        // Created rock songs
        Song song6 = new Song("Smells Like Teen Spirit", "Nirvana",05.01, "rock", "intense");
        allSongs.add(song6);
        Song song7 = new Song("Thunderstruck", "AC/DC", 04.52, "rock", "intense");
        allSongs.add(song7);
        Song song8 = new Song("Creep", "Radiohead", 03.56, "rock", "sad");
        allSongs.add(song8);
        Song song9 = new Song("Don't Stop Me Now", "Queen", 03.39, "rock", "happy");
        allSongs.add(song9);
        Song song10 = new Song("Ain't It Fun", "Paramore", 04.56, "rock", "happy");
        allSongs.add(song10);

        // Created jazz songs
        Song song11 = new Song("Sing, Sing, Sing", "Benny Goodman", 08.43, "jazz", "happy");
        allSongs.add(song11);
        Song song12 = new Song("Blue in Green", "Miles Davis", 05.37, "jazz", "sad");
        allSongs.add(song12);
        Song song13 = new Song("Mysterioso", "Thelonious Monk", 03.12, "jazz", "spooky");
        allSongs.add(song13);
        Song song14 = new Song("Caravan", "Duke Ellington", 03.21, "jazz", "spooky");
        allSongs.add(song14);
        Song song15 = new Song("A Night in Tunisia", "Dizzy Gillespie", 04.55, "jazz", "intense");
        allSongs.add(song15);

        User user = new User("Hugo123"); // creates a user object

        Scanner scanner = new Scanner(System.in); // allows the use of scanner for user input

        System.out.println("Hello user '" + user.getUsername() + "'");
        System.out.println("Choose a search option below: \n[1.All Songs] [2.Songs by Genre] [3.Songs by Mood]");
        int input = scanner.nextInt();
        scanner.nextLine(); // consumes the newline (when user presses enter)

        switch (input) {
            case 1: // prints all the songs
                for (Song song : allSongs) System.out.println("'" + song.getTitle() + "' by " + song.getArtist());
                break;
            case 2: // prints songs by genre based on user input
                System.out.println("Enter a genre: \n[Pop] [Rock] [Jazz]");
                String genre = scanner.nextLine(); // scans entire input line
                for (Song song : allSongs) {
                    if (genre.toLowerCase().equals(song.getGenre())) { // ensures the input is lowercase before comparing genres
                        System.out.println("'" + song.getTitle() + "' by " + song.getArtist());
                    }
                }
                break;
            case 3: // prints songs by mood based on user input
                System.out.println("Enter a mood: \n[Happy] [Sad] [Intense] [Spooky]");
                String mood = scanner.nextLine();
                for (Song song : allSongs) {
                    if (mood.toLowerCase().equals(song.getMood())) {
                        System.out.println("'" + song.getTitle() + "' by " + song.getArtist());
                    }
                }
                break;
            default: // prints "Invalid Option" by default
                System.out.println("Invalid option.");
                return;
        }

        System.out.println();
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

        popBangers.playAllSongs(); // plays all the songs in playlist
        System.out.println();

        user.deletePlaylist(rockHard); // removes playlist from list
    }
}