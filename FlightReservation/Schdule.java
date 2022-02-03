package FlightReservation;

import java.util.Date;
import java.util.List;

public class Schdule {
    private List<FlightSeat> fseats;

    public class FlightSchedule<fseats> {
        Flight flight;
        private Date departureTime;
        private String gate;
        private FlightStatus status;

        private List<FlightSeat> fseats;

        public Date getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(Date departureTime) {
            this.departureTime = departureTime;
        }

        public String getGate() {
            return gate;
        }

        public void setGate(String gate) {
            this.gate = gate;
        }

        public FlightStatus getStatus() {
            return status;
        }

        public void setStatus(FlightStatus status) {
            this.status = status;
        }

             return fseats;
        }

        public void setFseats(List<FlightSeat> fseats) {
            this.fseats = fseats;
        }
    }
}
