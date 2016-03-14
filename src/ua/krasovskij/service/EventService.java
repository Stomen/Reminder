package ua.krasovskij.service;

import java.util.ArrayList;
import java.util.List;

import ua.krasovskij.model.Event;

import ua.krasovskij.repository.EventRepository;

public class EventService {

	
	
	public static boolean add(Event event) {
		if (EventRepository.add(event)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean remove(int removeId) {
		if(EventRepository.remove(removeId)){
			return true;
		}
		return false;
	 }

		
	public static List<Event> display() {

		return EventRepository.getAll();

	}

	public static List<Event> search(String searchParam) {
		List<Event> result = new ArrayList<Event>();
		for (Event found : EventRepository.getAll()) {
			if (found.getTitle().equalsIgnoreCase(searchParam) || found.getDate().equalsIgnoreCase(searchParam)
					|| found.getTime().equalsIgnoreCase(searchParam)) {
				result.add(found);
			}
		}
		return result;

	}

}
