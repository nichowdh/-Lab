package problem2;
//Movie Theatre Management System, where you can create two classes one is main another one is movie, 

//movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
//MovieTicketPrice as instance variables

public class Main { // main class
	public static void main(String[] args) { // main method
		// creating object
		Movie obj = new Movie();
		// value input
		obj.set_name("Bramhastra");
		obj.set_startTime(10.00);
		obj.set_endTime(02.00);
		obj.set_ticketPrice(130.00);
		// printing the values
		System.out.println("Movie name: " + obj.get_name());
		System.out.println("Movie Start Time: " + obj.get_startTime());
		System.out.println("Movie END Time: " + obj.get_endTime());
		System.out.println("Ticket Price " + obj.get_ticketPrice());
	}

}
