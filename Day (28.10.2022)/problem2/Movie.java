package problem2;

public class Movie { // class
	// instance variables
	String movieName;
	double movieStartTime, movieEndTime, movieTicketPrice;

	// using getter method
	public String get_name() {
		return movieName;
	}

	public double get_startTime() {
		return movieStartTime;
	}

	public double get_endTime() {
		return movieEndTime;
	}

	public double get_ticketPrice() {
		return movieTicketPrice;
	}

	// using setter method
	public void set_name(String mn) {
		movieName = mn;
	}

	public void set_startTime(double st) {
		movieStartTime = st;
	}

	public void set_endTime(double et) {
		movieEndTime = et;
	}

	public void set_ticketPrice(double tp) {
		movieTicketPrice = tp;
	}

}
