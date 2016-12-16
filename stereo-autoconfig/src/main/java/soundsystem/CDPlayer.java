package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }
  
  @Autowired
  public void insert(CompactDisc cd) {
	  this.cd = cd;
  }
  
  public CompactDisc getCD() {
	  return cd;
  }

  public void play() {
    cd.play();
  }

}
