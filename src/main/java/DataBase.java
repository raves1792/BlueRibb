import java.util.ArrayList;

public class DataBase {

	static ArrayList<Ticket> allTickets = new ArrayList<Ticket>();
	static ArrayList<Flight> allFlights = new ArrayList<Flight>();
	static ArrayList<Copun> allCupons = new ArrayList<Copun>();	
	static ArrayList<Destination> allDestinations = new ArrayList<Destination>();

	
	public static void createData() {
		Flight f = new Flight(1, 10);
		allFlights.add(f);
		allTickets.add(f.addTicket(1));
		allTickets.add(f.addTicket(2));
		
		allCupons.add(new Copun(1, 0.5));
		allCupons.add(new Copun(2, 0.2));
		
		allDestinations.add(new Destination(1));
		allDestinations.add(new Destination(2));
	}
	
	public static ArrayList<Copun> getAllCopuns() {
		return allCupons;
	}
	
	public static ArrayList<Ticket> getAllTickets() {
		return allTickets;
	}

	public static ArrayList<Flight> getAllFlights() {
		return allFlights;
	}
	
	public static ArrayList<Destination> getAllDestinations() {
		return allDestinations;
	}
}
