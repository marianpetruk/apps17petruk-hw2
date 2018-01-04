package skipassTypes;

public enum Days {
    ONE(1), TWO(2), FIVE(5), UNLIMITED(-1);

    public int daysAllowed;

    Days(int numberOfDays) {
        this.daysAllowed = numberOfDays;
    }
}
