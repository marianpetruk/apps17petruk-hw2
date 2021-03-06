import java.util.Date;

public class Turnstile {

    public boolean ride(Skipass skipass) {
        if (checkValidity(skipass)) {
            skipass.use();
            return true;
        } else {
            blockPass(skipass);
        }
        return false;
    }


    public boolean blockPass(Skipass skipass){
        skipass.block();
        return true;
    }

    public boolean checkValidity(Skipass skipass) {
        if (skipass.isBlocked()) {
            return false;
        } else if (skipass.getType().equals("Rides")) {
            return skipass.getRidesLeft() > 0;
        } else if (skipass.getType().equals("Days")) {
            return new Date().before(skipass.getExpirationDate());
        } else return skipass.getType().equals("Season");

    }


}
