
public class Main {

	public static void main(String[] args) {
		DataBase.createData();
		Manager manager = new Manager();
		
		//A
		int ticketId = 700;
		boolean isAva = manager.checkIfTicketAvailable(ticketId);
		System.out.println("Avalabale Ticket " + ticketId + " : " + isAva);
		
		ticketId = 1;
		isAva = manager.checkIfTicketAvailable(ticketId);
		System.out.println("Availabale Ticket " + ticketId + " : " + isAva);

		//B
		int destination = 1;
		boolean isSucces = manager.checkInBaggage(destination, "102");
		System.out.println("the check-in of destinayion num " + destination +" is succes? " + isSucces);

		destination = 700;
		isSucces = manager.checkInBaggage(destination, "102");
		System.out.println("the check-in of destinayion num " + destination +" is succes? " + isSucces);
		
		//C
		double oldPrice = 100.0;
		double newPrice = manager.payWithCopun(1, oldPrice);
		if (newPrice == -1)
			System.out.println("The Copun is not valid");
		else
			System.out.println("old price is " + oldPrice + ", the new price is " + newPrice);
		
		oldPrice = 100.0;
		newPrice = manager.payWithCopun(700, oldPrice);
		if (newPrice == -1)
			System.out.println("The Copun is not valid");
		else
			System.out.println("old price is " + oldPrice + ", the new price is " + newPrice);
	}
}
