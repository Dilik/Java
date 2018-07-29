import java.net.InetAddress;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.NtpV3Packet;
import org.apache.commons.net.ntp.TimeInfo;


public class TimeCheck{

    public static final String TIME_SERVER = "0.north-america.pool.ntp.org";
    
    public static void main(String[] args){
	NTPUDPClient timeClient = new NTPUDPClient();
	try{
	    InetAddress inetAddress = InetAddress.getByName(TIME_SERVER);
	    TimeInfo timeInfo = timeClient.getTime(inetAddress);
	    NtpV3Packet message = timeInfo.getMessage();
	    long serverTime = message.getTransmitTimeStamp().getTime();
	    Date time = new Date(serverTime);
	    System.out.println("Time from " + TIME_SERVER + ": " + time);
	    
	} catch (Exception ex){ ex.printStackTrace();}
	
	
	
    }
}
