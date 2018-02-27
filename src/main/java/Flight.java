import java.util.ArrayList;

public class Flight {

	ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	int availableTickets;
	int idFlight;
	
	public Flight(int id, int available) {
		idFlight = id;
		availableTickets = available;
	}
	
	public Ticket addTicket(int id) {
		Ticket t = new Ticket(id, this); 
		tickets.add(t);
		return t;
	}
}
