package ua.krasovskij.utils;

import ua.krasovskij.model.Event;

public class EventUtil {

	public static Event createEvent(String title, String date, String time) {
		if (checkParam(title, date, time)) {
			return new Event(title, date, time);
		}

		return null;

	}

	private static boolean checkParam(String title, String date, String time) {
		return !(title == null || date == null || time == null || title.isEmpty() || date.isEmpty() || time.isEmpty());

	}
	
	public static String printEvent(Event event){
		return "<h3> Title : " + event.getTitle() + " Date : " + event.getDate() + " Time : " + event.getTime() + "</h3><br>";
		}

}
