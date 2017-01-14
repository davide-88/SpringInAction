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
@ContextConfiguration(classes = SoundSystemConfig.class)
public class ImportXmlConfigTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule();

	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		log.enableLog();
		player.play();
		assertEquals(String.format("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles%n"
				+ "-Track: Sgt. Pepper's Lonely Hearts Club Band%n" 
				+ "-Track: With a Little Help from My Friends%n"
				+ "-Track: Lucy in the Sky with Diamonds%n" 
				+ "-Track: Getting Better%n" 
				+ "-Track: Fixing a Hole%n"),
				log.getLog());
		log.clearLog();
	}

}
