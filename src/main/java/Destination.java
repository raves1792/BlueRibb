import java.util.ArrayList;
import java.util.List;

public class Destination {

	int destinationID;
	List<String> baggages = new ArrayList<String>();
	
	public Destination(int id) {
		destinationID = id;
	}
	
	public void checkInBaggaes(String baggage){
		baggages.add(baggage);
	}
}
