package soundsystem;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
//@Component
@Component("lonleyHearts")
public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}
