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

	@GetMapping("/2")
	public String message2() {
		return "new commit..";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinPipelineDockerApplication.class, args);
	}

}
