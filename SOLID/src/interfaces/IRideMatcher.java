package interfaces;

import ride.RideRequest;
import user.Driver;

public interface IRideMatcher {
    Driver matchDriver(RideRequest request);
}
