package soundsystem.collections;

import java.util.List;

import soundsystem.CompactDisc;

public class Discography {
	private String artist;
	private List<CompactDisc> cds;

	public Discography(String artist, List<CompactDisc> cds) {
		this.artist = artist;
		this.cds = cds;
	}

	public String getArtist() {
		return artist;
	}

	public List<CompactDisc> getCds() {
		return cds;
	}
	
	public void playDiscography() {
		for (CompactDisc compactDisc : cds) {
			compactDisc.play();
		}
	}
	  
}
