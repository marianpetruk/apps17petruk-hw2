package skipassTypes;

public enum Rides {
    TEN(1), TWENTY(2), FIFTY(5), HUNDRED(100), UNLIMITED(-1);

    public int ridesAllowed;

    Rides(int numberOfRides) {
        this.ridesAllowed = numberOfRides;
    }
}
