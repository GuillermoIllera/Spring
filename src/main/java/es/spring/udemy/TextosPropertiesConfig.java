package es.spring.udemy;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:textos.properties") 
	// Se separan por comas si hay diferentes
})
public class TextosPropertiesConfig {

}
