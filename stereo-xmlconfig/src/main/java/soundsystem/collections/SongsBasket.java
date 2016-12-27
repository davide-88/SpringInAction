package soundsystem.collections;

import java.util.LinkedHashSet;
import java.util.Set;

import soundsystem.BlankSong;

public class SongsBasket {
	private LinkedHashSet<BlankSong> songs;

	public SongsBasket(LinkedHashSet<BlankSong> songs) {
		this.songs = songs;
	}

	public Set<BlankSong> getSongs() {
		return songs;
	}
	
	public void playSongs() {
		for (BlankSong song : songs) {
			song.play();
		}
	}
	  
}
