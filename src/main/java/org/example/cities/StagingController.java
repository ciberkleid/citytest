package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StagingController {

	@RequestMapping("/")
	public String index() {
		String blue = "#81BEF7";
		String green = "#9FF781";
		String color = blue;
		// String color = green;
		return "<body style=\"background:" + color + "\"><h1><center>Hello, World!</center></h1>"; // blue
	}
}
