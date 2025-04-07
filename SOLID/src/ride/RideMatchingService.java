package ride;
import java.util.List;
import interfaces.IRideMatcher;
import user.Driver;

public class RideMatchingService implements IRideMatcher {
        private List<Driver>availableDriver;
        public RideMatchingService(List<Driver>drivers){
            this.availableDriver=drivers;
        }

        @Override
        public Driver matchDriver(RideRequest request){
            //simple logic - match with first available driver
            return availableDriver.isEmpty()?null : availableDriver.get(0);
        }
}
