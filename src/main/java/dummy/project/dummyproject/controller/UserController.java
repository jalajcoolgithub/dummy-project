package dummy.project.dummyproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/admin")
	public String adminAccess() {
		return "admin page";
	}

	@GetMapping("/user")
	public String userAccess() {
		return "user page";
	}

}
