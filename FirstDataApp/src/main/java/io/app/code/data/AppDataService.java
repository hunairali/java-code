package io.app.code.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppDataService {
	
	@Autowired
	private AppDataRepository appRepository;
	
	

	
	public List<DataTopic> getAllTopics(){
		
		  List<DataTopic> topics = new ArrayList<>();
		    appRepository.findAll().forEach(topics::add);
		    return topics;	
		
	}
	
	
	public DataTopic getTopic(String id) {
		
		return appRepository.findById(id).
				orElseThrow(() -> new RuntimeException("Topic not found: " + id));
		
	}
	
	
	public void addTopic(DataTopic topic) {
		
		appRepository.save(topic);
		
	}
	
	public void updateTopic(String id,DataTopic topic) {
		
		appRepository.save(topic);
		
	}
	
	public void deleteTopic(String id) {
		
		appRepository.deleteById(id);
	}
	
	
	

}
