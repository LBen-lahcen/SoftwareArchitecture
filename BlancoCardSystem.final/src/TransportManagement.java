
public class TransportManagement {

	public int TransportID;
	public int TransportLocation;
	public boolean TransportAvailability;
	public int TransportFee;
	
	//constructor
	public TransportManagement(int transportID, int transportLocation, boolean transportAvailanility,
			int transportFee) {
		super();
		TransportID = transportID;
		TransportLocation = transportLocation;
		TransportAvailability = transportAvailanility;
		TransportFee = transportFee;
	}
	
	
	// getters & setters
	public int getTransportID() {
		return TransportID;
	}
	public void setTransportID(int transportID) {
		TransportID = transportID;
	}
	public int getTransportLocation() {
		return TransportLocation;
	}
	public void setTransportLocation(int transportLocation) {
		TransportLocation = transportLocation;
	}
	public boolean isTransportAvailanility() {
		return TransportAvailability;
	}
	public void setTransportAvailanility(boolean transportAvailanility) {
		TransportAvailability = transportAvailanility;
	}
	public int getTransportFee() {
		return TransportFee;
	}
	public void setTransportFee(int transportFee) {
		TransportFee = transportFee;
	}
}
