package dummy.project.dummyproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String welcome() {
		return "welcome in the microservice";
	}

	@GetMapping("/test")
	public String test() {
		return "tested";
	}
}
