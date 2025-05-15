package classAndObject;

public class FlightDTO {

    private String person;
    private String from;
    private String to;
    private static String ticketAmount = "5000";

    public void showFlightInfo() {
        System.out.println("Passenger: " + person + ", From: " + from + ", To: " + to);
    }

    public static void showAirlineName() {
        System.out.println("Welcome to Indian Airline");
    }

	public static void main(String args [])
	{
		 FlightDTO  flightDTO= new  FlightDTO();
		flightDTO.showFlightInfo();
	         showAirlineName()
	}
}
