package ua.krasovskij.repository;

import java.util.ArrayList;
import java.util.List;

import ua.krasovskij.model.Event;

public class EventRepository {
	private static List<Event> eventList = new ArrayList<Event>();

	public static List<Event> getAll() {
		return eventList;
	}

	public static boolean add(Event event) {
		if(event == null){
			return false;
		}
		else
			return eventList.add(event);
			
	}

	public static boolean remove(int id) {
		
		for(Event event : eventList){
			if(event.getId() == id){
				eventList.remove(event);
				return true;
			}
		}
		return false;
		
	}
	public static List<Event> search(String searchParam){
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
