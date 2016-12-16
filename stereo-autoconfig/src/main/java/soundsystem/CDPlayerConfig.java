package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
//@ComponentScan(basePackages={"soundsystem",...})
@ComponentScan(basePackageClasses={CDPlayer.class})
public class CDPlayerConfig { 
}
