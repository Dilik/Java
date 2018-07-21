import java.rmi.*;
import java.util.*;
import java.rmi.server.*;

public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer{

    HashMap serviceList;

    public ServiceServerImpl() throws RemoteException{
	setUpServices();
    }

    //constructor 
    private void setUpServices(){
	serviceList = new HashMap();
	serviceList.put("Dice Rolling Service", new DiceService());
	serviceList.put("Day of the Week Service", new DayOfTheWeekService());
	serviceList.put("Visual Music Service", new MiniMusicService());
    }

    //get the list of service names. return is a list of objects
    public Object[] getServiceList(){
	System.out.println("in remote");
	return serviceList.keySet().toArray();
    }

    //user selects the service and this method gets actual service based on
    //the key corresponds to the service in the HashMap
    public Service getService(Object serviceKey) throws RemoteException{
	Service theService = (Service) serviceList.get(serviceKey);
	return theService;
    }


    public static void main(String[] args){
	try{
	    Naming.rebind("ServiceServer", new ServiceServerImpl());
	} catch (Exception ex){
	    ex.printStackTrace();
	}

	System.out.println("Remote service is running");
    }

}
