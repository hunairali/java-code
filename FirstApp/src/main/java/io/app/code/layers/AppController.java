package io.app.code.layers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {
	
	@Autowired
	private AppService appservice;
	
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
		
		return appservice.getAllTopics();
		
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		
		return appservice.getTopic(id);
		
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		
		appservice.addTopic(topic);
		
	}
	
	@PutMapping("/topics/{id}")
	public void updateopic(@RequestBody Topic topic,@PathVariable String id) {
		
		appservice.updateTopic(id,topic);
		
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		
		 appservice.deleteTopic(id);
		
	}
	

}
