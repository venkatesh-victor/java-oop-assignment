package encapsulation;

public class Flight {
    private String flightModel;
    private int noOfEngine;
    private int noOfPilotsNeeded;
    private boolean hasAutoPilot;
    private int hoursFlown;
    private int passengerCapacity;

    private double highestSpeed;
    private double averageSpeed;
    private double fuelCapacity;
    private static String airlineCompany;


    public String getFlightModel() {
        return flightModel;
    }

    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }

    public int getNoOfEngine() {
        return noOfEngine;
    }

    public void setNoOfEngine(int noOfEngine) {
        this.noOfEngine = noOfEngine;
    }

    public int getNoOfPilotsNeeded() {
        return noOfPilotsNeeded;
    }

    public void setNoOfPilotsNeeded(int noOfPilotsNeeded) {
        this.noOfPilotsNeeded = noOfPilotsNeeded;
    }

    public boolean isHasAutoPilot() {
        return hasAutoPilot;
    }

    public void setHasAutoPilot(boolean hasAutoPilot) {
        this.hasAutoPilot = hasAutoPilot;
    }

    public int getHoursFlown() {
        return hoursFlown;
    }

    public void setHoursFlown(int hoursFlown) {
        this.hoursFlown = hoursFlown;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getHighestSpeed() {
        return highestSpeed;
    }

    public void setHighestSpeed(double highestSpeed) {
        this.highestSpeed = highestSpeed;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public static String getAirlineCompany() {
        return airlineCompany;
    }

    public static void setAirlineCompany(String airlineCompany) {
        Flight.airlineCompany = airlineCompany;
    }
}
