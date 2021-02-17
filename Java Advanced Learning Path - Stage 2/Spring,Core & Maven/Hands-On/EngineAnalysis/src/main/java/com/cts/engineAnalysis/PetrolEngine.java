package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {


    public PetrolEngine(int torque, int rpm, String fuel) {
        super(torque, rpm, fuel);
    }

    @Override
    public int getPerformance() {
        return (getTorque() * getRpm()) / 5252;
    }
}
