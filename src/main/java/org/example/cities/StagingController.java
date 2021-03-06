package org.example.cities;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StagingController {

	@RequestMapping("/")
	public String index() {

		System.out
				.println("Generating home page for app at " + System.getenv().get("VCAP_APP_HOST")
						+ ":" + System.getenv().get("VCAP_APP_PORT"));

		String blue = "#81BEF7";
		String green = "#9FF781";

		// Blue/Green deploy demo
		String color = blue;
		// String color = green;

		StringBuffer s = new StringBuffer();

		s.append("<body style=\"background:");
		s.append(color);
		s.append("\">");
		s.append("<h1><center>Hello, World!</center></center></h1>");
		s.append("<center>");
		s.append("<br>This app is listening on port ");
		s.append(System.getenv().get("VCAP_APP_PORT"));
		s.append("</center>");

		return s.toString();

	}
}
