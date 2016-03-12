package ua.krasovskij.model;

public class Event {
	private static int count;

	private String title;
	private String date;
	private String time;
	private int id;

	public Event(String title, String date, String time) {
		this.title = title;
		this.date = date;
		this.time = time;
		this.id  = count;
		count++;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getId() {
		return id;
	}

		

}
