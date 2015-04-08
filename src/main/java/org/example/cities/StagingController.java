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
		s.append("\">");
		s.append("<h1><center>Hello, World!</center></center></h1>");
		s.append("<center>");
		s.append("<br>This app is running on ");
		s.append(System.getenv().get("VCAP_APP_HOST") + ":" + System.getenv().get("VCAP_APP_PORT") );
		s.append("</center>");
		
		/*
		s.append("<table border=\"1\" style=\"width:60%\">");
		s.append("<tr>");
		s.append("<th colspan=\"2\">Application Environment Variables</th>");
		s.append("</tr>");
		for (Map.Entry<String, String> envvar : System.getenv().entrySet()) {
			s.append("<tr>");
			s.append("<td>"+envvar.getKey()+"</td>");
			s.append("<td>"+envvar.getValue()+"</td>");
			s.append("</tr>");
	    }
		s.append("</table>");
		*/
		
		return s.toString();
		
	}
}
