package hellocucumber;

public class IsItFriday {

    public static final String FRIDAY = "Friday";
    public static final String TGIF = "TGIF";
    public static final String NOPE = "Nope";

    static String isItFriday(String today) {
        return FRIDAY.equals(today)
                ? TGIF
                : NOPE;
    }
}
