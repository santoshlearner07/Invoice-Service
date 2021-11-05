package com.company;

public class InvoiceGenerator {
    private static final int MINIMUM_COST_PER_KM = 10;
    private static final double COST_PER_TIME = 1;
    private static final double MINIUM_FARE = 5.0;

    public double calculateFare(double distance, int time) {
        double totalFare = ((distance * MINIMUM_COST_PER_KM) + (time * COST_PER_TIME));
        if (totalFare < MINIUM_FARE)
            return MINIUM_FARE;
        return totalFare;
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0.0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}
