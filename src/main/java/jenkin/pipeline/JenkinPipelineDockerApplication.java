package jenkin.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinPipelineDockerApplication {

	@GetMapping
	public String message() {
		return "Jenkin docker pipeline builded successfully...";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinPipelineDockerApplication.class, args);
	}

}