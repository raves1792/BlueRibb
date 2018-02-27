
public class Ticket {

	int ticketID;
	Flight flight;
	double price = 100;
	
	public Ticket(int id, Flight myFlight) {
		ticketID = id;	
		flight = myFlight;
	}
}
