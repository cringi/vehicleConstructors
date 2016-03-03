public class Vehicle {
    private static final int MIN_LOCATION=-20, MAX_LOCATION=20;
    private static int location;

    public Vehicle() {
        location = 0;
    }

    public Vehicle(int loc) {
        if (MIN_LOCATION <= loc && MAX_LOCATION >= loc) {
            location = loc;
        }
        else {
            location = 0;
        }
    }

    public void forward() {
        if((location + 1) <= MAX_LOCATION) {
            location++;
        }
    }

    public void backward() {
        if((location-1) >= MIN_LOCATION) {
            location--;
        }
    }

    public int getLocation() {
        return location;
    }

    public String toString() {
        String vehicle = "";
        int prior, further;

        prior = Math.abs(getLocation() - MIN_LOCATION);
        further = Math.abs(MAX_LOCATION - getLocation());

        for(int x=0;x<prior;x++) {
            vehicle = vehicle + ".";
        }

        vehicle = vehicle + "@";

        for(int x=0;x<further;x++) {
            vehicle = vehicle + ".";
        }

        return vehicle;
    }

}
