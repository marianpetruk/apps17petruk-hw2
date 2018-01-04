import skipassTypes.*;

public class SkipassFactory {
    public Skipass releaseNewSkipass(Rides rides, Days days) {
        if (rides.equals(Rides.UNLIMITED) && days.equals(Days.UNLIMITED)) {
            return new SeasonPass();
        } else if (rides.equals(Rides.UNLIMITED)) {
            return new DaysPass(days);
        } else if (days.equals(Days.UNLIMITED)) {
            return new RidesPass(rides);
        } else {
            System.out.println("Error! Wrong type(s) in SkipassFactory.");
            return null;
        }

    }
}
