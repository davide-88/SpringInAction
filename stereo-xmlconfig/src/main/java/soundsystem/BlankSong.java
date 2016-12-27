package soundsystem;

public class BlankSong {
	private String title;
	private String author;
	
	public BlankSong(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void play() {
		System.out.println(String.format("Playing %s by %s", title, author));
	}

}
