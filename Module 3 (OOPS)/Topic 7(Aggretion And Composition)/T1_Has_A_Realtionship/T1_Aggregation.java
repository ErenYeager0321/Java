package T1_Has_A_Realtionship;

class Song {
	String title;
	String artist;
}
	
class Playlist {
	Song track;
	
	void playSong(Song banger) {
		track = banger;
		System.out.println("Now Playing: " + track.title);
		System.out.println("Artist: " + track.artist);
	}
}

public class T1_Aggregation {
	public static void main(String[] args) {
		Song hitSong = new Song();
		hitSong.title = "Kolaveri Di";
		hitSong.artist = "Dhanush";
		
		Playlist myPlaylist = new Playlist();
		myPlaylist.track = hitSong;
		
		myPlaylist.playSong(hitSong);
		
		System.out.println("This song is fire! It's also on my friend's playlist!");
		System.out.println("Song: " + hitSong.title + " by " + hitSong.artist);
		}
}
