package FlightReservation;
import javax.swing.JList;
public class Airline {
    private String name;
    private String code;

    private JList<Flight> flights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public JList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(JList<Flight> flights) {
        this.flights = flights;
    }

        }
