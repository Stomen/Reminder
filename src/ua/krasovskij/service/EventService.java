package ua.krasovskij.service;


import java.util.List;

import ua.krasovskij.model.Event;

import ua.krasovskij.repository.EventRepository;

public class EventService {

	
	
	public static boolean add(Event event) {
		return EventRepository.add(event);
			
	}

	public static boolean remove(int removeId) {
		return EventRepository.remove(removeId);
	 }

		
	public static List<Event> display() {

		return EventRepository.getAll();

	}

	public static List<Event> search(String searchParam) {
		return EventRepository.search(searchParam);

	}

}
