import org.junit.Test;
import org.junit.Assert;

public class tests {

    @Test
    public void checkIfTicketAvailable() {
    	DataBase.createData();
    	Manager manager = new Manager();
    	manager.checkIfTicketAvailable(1);
       
    	Assert.assertEquals(false, manager.checkIfTicketAvailable(1));
    	Assert.assertEquals(true, manager.checkIfTicketAvailable(700));
    }
}
