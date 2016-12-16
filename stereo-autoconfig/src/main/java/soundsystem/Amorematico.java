package soundsystem;
import org.springframework.stereotype.Component;

@Component
public class Amorematico implements CompactDisc {

  private String title = "Amorematico";  
  private String artist = "Subsonica";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}
