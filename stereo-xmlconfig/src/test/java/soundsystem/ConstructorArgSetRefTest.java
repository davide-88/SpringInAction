package soundsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import soundsystem.collections.SongsBasket;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ConstructorArgSetRefTest {

  @Rule
  public final SystemOutRule log = new SystemOutRule();

  @Autowired
  private SongsBasket basket;

  @Test
  public void play() {
		log.enableLog();
		basket.playSongs();
		assertEquals(String.format("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles%n" 
				+ "Playing With a Little Help from My Friends by The Beatles%n"
				+ "Playing Lucy in the Sky with Diamonds by The Beatles%n" 
				+ "Playing Getting Better by The Beatles%n" 
				+ "Playing Fixing a Hole by The Beatles%n"
				+ "Playing She's Leaving Home by The Beatles%n" 
				+ "Playing Being for the Benefit of Mr. Kite! by The Beatles%n"
				+ "Playing Within You Without You by The Beatles%n" 
				+ "Playing When I'm Sixty-Four by The Beatles%n" 
				+ "Playing Lovely Rita by The Beatles%n"
				+ "Playing Good Morning Good Morning by The Beatles%n" 
				+ "Playing Sgt. Pepper's Lonely Hearts Club Band (Reprise) by The Beatles%n"
				+ "Playing A Day in the Life by The Beatles%n"), log.getLog());
  }

}
