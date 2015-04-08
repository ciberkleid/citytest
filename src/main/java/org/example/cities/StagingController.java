package org.example.cities;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StagingController {

	@RequestMapping("/")
	public String index() {
		
		String blue = "#81BEF7";
		String green = "#9FF781";
		
		// Blue/Green deploy demo
		// String color = blue;
		String color = green;
		
		StringBuffer s = new StringBuffer();
		
		s.append("<body style=\"background:");
		s.append(color);
		s.append("\"><h1><center>Hello, World!</center></h1>");
		s.append("<br><br>Application Environment Variables:<br>");
		for (Map.Entry<String, String> envvar : System.getenv().entrySet()) {
	        s.append("<br><b>" + envvar.getKey() + ":</b> " + envvar.getValue());
	    }
		return s.toString();
		
	}
}
