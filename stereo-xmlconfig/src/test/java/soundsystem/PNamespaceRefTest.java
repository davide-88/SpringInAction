package soundsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class PNamespaceRefTest {

  @Rule
  public final SystemOutRule log = new SystemOutRule();

  @Autowired
  private MediaPlayer player;

  @Test
  public void play() {
	  log.enableLog();
	  player.play();
	  assertEquals(
			  String.format("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles%n"), 
			  log.getLog());
  }

}
