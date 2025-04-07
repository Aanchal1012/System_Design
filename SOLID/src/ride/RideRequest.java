package ride;

public class RideRequest {
    private Ride rider;
    private String pickuplocation;
    private String droplocation;
    public RideRequest(Ride rider, String pickup, String drop){
        this.rider = rider;
        this.pickuplocation=pickup;
        this.droplocation=drop;
    }
    public Ride getRider(){
        return rider;
    }
    public String getPickuplocation(){
        return pickuplocation;
    }
    public String getDroplocation(){
        return droplocation;
    }
}
