import skipassTypes.Rides;

import java.util.Date;

public class RidesPass extends Skipass {
    private Date releaseDate;
    private int ridesLeft;

    RidesPass(Rides rides) {
        this.ridesLeft = rides.ridesAllowed;
    }

    public Date getReleaseDate() {
        return this.releaseDate;
    }

    @Override
    public Date getExpirationDate() {
        return null;
    }


    public String getType() {
        return "Rides";
    }

    @Override
    public void use() {
        this.ridesLeft--;
        ride();
    }

    @Override
    public int getRidesLeft() {
        return this.ridesLeft;
    }
}
