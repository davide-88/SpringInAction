package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	
	// @Bean(name="sgtPeppersLonelyHearts")
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}

//	@Bean
//	public CDPlayer cdPlayer() {
//		return new CDPlayer(this.compactDisc());
//	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}

}
