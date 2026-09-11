package io.app.code.data;


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
public class AppDataController {
	
	@Autowired
	private AppDataService appservice;
	
	
	@GetMapping("/topicsdb")
	public List<DataTopic> getAllTopics(){
		
		return appservice.getAllTopics();
		
	}
	
	@GetMapping("/topicsdb/{id}")
	public DataTopic getTopic(@PathVariable String id) {
		
		return appservice.getTopic(id);
		
	}
	
	@PostMapping("/topicsdb")
	public void addTopic(@RequestBody DataTopic topic) {
		
		appservice.addTopic(topic);
		
	}
	
	@PutMapping("/topicsdb/{id}")
	public void updateopic(@RequestBody DataTopic topic,@PathVariable String id) {
		
		appservice.updateTopic(id,topic);
		
	}
	
	@DeleteMapping("/topicsdb/{id}")
	public void deleteTopic(@PathVariable String id) {
		
		 appservice.deleteTopic(id);
		
	}
	

}
