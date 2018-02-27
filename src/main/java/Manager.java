import java.util.List;

public class Manager {

	
	public boolean checkIfTicketAvailable(int ticketID) {
		List<Ticket> tickets = DataBase.getAllTickets();
		
		for (Ticket currTicket: tickets) 
			if (currTicket.ticketID == ticketID)
				return false;
		
		return true;
	}
	
	public double payWithCopun(int copunID, double price){
		List<Copun> copuns = DataBase.getAllCopuns();

		for (Copun copun : copuns) {
			if (copun.coopunID == copunID)
				return price * (1- copun.discountPrecents);
		}
		
		return -1;
	}
	
	public boolean checkInBaggage(int desID, String baggageID) {
		List<Destination> destinations = DataBase.getAllDestinations();
		
		for (Destination currDes : destinations) {
			if (currDes.destinationID == desID) {
				currDes.checkInBaggaes(baggageID);
				return true;
			}	
		}
		
		return false;
	}
}
