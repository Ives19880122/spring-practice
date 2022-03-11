package idv.ives.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import idv.ives.spring.dto.ImportFile;

@Configuration
@ComponentScan(basePackages= {
	"idv.ives.spring.service", 
	"idv.ives.spring.tool"
})
public class AppConfig {
	@Bean(value="importFile")
	public ImportFile importFile() {
		return new ImportFile();
	}
}
