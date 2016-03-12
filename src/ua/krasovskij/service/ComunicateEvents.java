package ua.krasovskij.service;

import java.util.ArrayList;
import java.util.List;

import ua.krasovskij.model.Event;

import ua.krasovskij.repository.EventRepository;

public class ComunicateEvents {

	private final static String ERROR = "Error";
	private final static String SUCCESS = "Success";

	public static String add(Event event) {
		if (event.equals(null)) {
			return ERROR;
		} else {
			EventRepository.add(event);
			return SUCCESS;
		}
	}

	public static String remove(int removeId) {
		
		for(Event event : EventRepository.getAll()){
			if(event.getId() == removeId){
				EventRepository.remove(removeId);
				return SUCCESS;
			}
		}
		return ERROR;
		
	}

	public static List<Event> display() {
		
		return EventRepository.getAll();

	}

	public static List<Event> search(String searchParam) {
		List<Event> result = new ArrayList<Event>();
		for(Event found : EventRepository.getAll()){
			if(found.getTitle().equalsIgnoreCase(searchParam) || found.getDate().equalsIgnoreCase(searchParam) || found.getTime().equalsIgnoreCase(searchParam)){
				result.add(found);
			}
		}
		return result;
			
	}

}
