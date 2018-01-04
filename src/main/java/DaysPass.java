import skipassTypes.Days;

import java.util.Calendar;
import java.util.Date;

public class DaysPass extends Skipass {
    private Date releaseDate;
    private Date expirationDate;

    DaysPass(Days days) {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        this.releaseDate = c.getTime();
        c.add(Calendar.DATE, days.daysAllowed);
        this.expirationDate = c.getTime();
    }

    @Override
    public Date getReleaseDate() {
        return this.releaseDate;
    }

    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
    }


    @Override
    public String getType() {
        return "Days";
    }

    @Override
    public int getRidesLeft() {
        return -1;
    }

    @Override
    public void use() {
        ride();
    }

}
