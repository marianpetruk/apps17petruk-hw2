import java.util.Date;

public class SeasonPass extends Skipass {

    private Date releaseDate;

    SeasonPass() {
        this.releaseDate = new Date();
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public Date getExpirationDate() {
        return null;
    }

    @Override
    public String getType() {
        return "Season";
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
