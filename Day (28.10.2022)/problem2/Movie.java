package problem2;

public class Movie { // class
	// instance variables
	private String movieName, movieStartTime, movieEndTime;
	private double movieTicketPrice;

	// using getter method
	public String get_name() {
		return movieName;
	}

	public String get_startTime() {
		return movieStartTime;
	}

	public String get_endTime() {
		return movieEndTime;
	}

	public double get_ticketPrice() {
		return movieTicketPrice;
	}

	// using setter method
	public void set_name(String mn) {
		movieName = mn;
	}

	public void set_startTime(String st) {
		movieStartTime = st;
	}

	public void set_endTime(String et) {
		movieEndTime = et;
	}

	public void set_ticketPrice(double tp) {
		movieTicketPrice = tp;
	}

}
