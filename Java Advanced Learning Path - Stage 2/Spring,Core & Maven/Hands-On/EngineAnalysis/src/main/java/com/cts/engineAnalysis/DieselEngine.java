package com.cts.engineAnalysis;

public class DieselEngine extends Engine {

    public DieselEngine(int rpm, int torque, String fuel) {
        super(rpm, torque, fuel);
    }

    @Override
    public int getPerformance() {
        return (getTorque() * getRpm()) / 63025;
    }
}
