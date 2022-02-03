package FlightReservation;

public class Flight {
    private String flightNO;
    int duration;
    private Airport departure;
    private Airport arrival;
    public String getFlightNO() {
        return flightNO;
    }
    public void setFlightNO(String flightNO) {
        this.flightNO = flightNO;
    }
    public Airport getDeparture() {
        return departure;
    }
    public void setDeparture(Airport departure) {
        this.departure = departure;
    }
    public Airport getArrival() {
        return arrival;
    }
    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }
}

