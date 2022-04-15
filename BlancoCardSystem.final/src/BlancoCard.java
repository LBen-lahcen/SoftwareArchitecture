
public class BlancoCard {
	
	private int PassengerID;
	private String PassengerBirthdate;
	private String PassengerAdress;
	private Boolean PaymentAutomated;
	public String PassengerLocationTrack;
	public int TransportVehicleID;
	
	//constructor
	public BlancoCard(int passengerID, String passengerBirthdate, String passengerAdress, Boolean paymentAutomated,
			String passengerLocationTrack, int transportVehicleID) {
		super();
		PassengerID = passengerID;
		PassengerBirthdate = passengerBirthdate;
		PassengerAdress = passengerAdress;
		PaymentAutomated = paymentAutomated;
		PassengerLocationTrack = passengerLocationTrack;
		TransportVehicleID = transportVehicleID;
	}
	
	//getters and setters 
	public int getPassengerID() {
		return PassengerID;
	}
	public void setPassengerID(int passengerID) {
		PassengerID = passengerID;
	}
	public String getPassengerBirthdate() {
		return PassengerBirthdate;
	}
	public void setPassengerBirthdate(String passengerBirthdate) {
		this.PassengerBirthdate = passengerBirthdate;
	}
	public String getPassengerAdress() {
		return PassengerAdress;
	}
	public void setPassengerAdress(String passengerAdress) {
		this.PassengerAdress = passengerAdress;
	}
	public Boolean getPaymentAutomated() {
		return PaymentAutomated;
	}
	public void setPaymentAutomated(Boolean paymentAutomated) {
		this.PaymentAutomated = paymentAutomated;
	}
	public String getPassengerLocationTrack() {
		return PassengerLocationTrack;
	}
	public void setPassengerLocationTrack(String passengerLocationTrack) {
		PassengerLocationTrack = passengerLocationTrack;
	}
	public int getTransportVehicleID() {
		return TransportVehicleID;
	}
	public void setTransportVehicleID(int transportVehicleID) {
		TransportVehicleID = transportVehicleID;
	}
	
	
}
