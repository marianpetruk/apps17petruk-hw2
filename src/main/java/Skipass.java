import java.util.Date;

public abstract class Skipass {
    private static int IDCounter = 0;
    private final int ID;
    private int numberOfRides = 0;
    private boolean blocked = false;


    Skipass() {
        IDCounter++;
        this.ID = IDCounter;
    }

    public abstract Date getReleaseDate();

    public abstract Date getExpirationDate();


    public int getNumberOfRides() {
        return this.numberOfRides;
    }


    public int getId() {
        return this.ID;
    }

    public abstract String getType();


    public boolean isBlocked() {
        return this.blocked;
    }

    public boolean block() {
        this.blocked = true;
        return true;
    }

    public boolean unblock() {
        this.blocked = false;
        return true;
    }

    public boolean ride() {
        this.numberOfRides++;
        return true;
    }

    public abstract int getRidesLeft();

    public abstract void use();


}
