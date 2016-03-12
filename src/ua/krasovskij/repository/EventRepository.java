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
		int firstState = eventList.size() ;
		int secondState;
		eventList.add(event);
		secondState = eventList.size() ;
			if(firstState == secondState){
				return false;
			}
			else 
				return true;
			
	}

	public static boolean remove(int id) {
		
		int firstState = eventList.size() ;
		int secondState;
		eventList.remove(id);
		secondState = eventList.size() ;
			if(firstState == secondState){
				return false;
			}
			else{ 
				return true;
			}
	}

}
