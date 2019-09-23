package exception;

public class RosszDatum extends Exception {
    public RosszDatum() {
    }

    public RosszDatum(String message) {
        super(message);
    }
}
