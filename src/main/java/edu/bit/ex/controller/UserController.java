package edu.bit.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.ex.service.UserService;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */

@Log4j
@AllArgsConstructor
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user/userForm")
	public void userForm() {
		log.info("Welcome userForm");
	}

	@PostMapping("/user/addUser")
	public String addUser(UserVO uservo) {
		log.info("post resister");
		userService.addUser(uservo);

		return "redirect:/";
	}
}
