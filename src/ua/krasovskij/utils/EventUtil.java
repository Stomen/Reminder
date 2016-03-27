package ua.krasovskij.utils;

import ua.krasovskij.model.Event;

public class EventUtil {

	public static Event createEvent(String title, String date, String time) {
		if (checkParam(title, date, time)) {
			return new Event(title, date, time);
		}
		throw new IllegalArgumentException("Bad parameters");

	}

	private static boolean checkParam(String title, String date, String time) {
		return !(title == null || date == null || time == null || title.isEmpty() || date.isEmpty() || time.isEmpty());

	}
	
	

}
