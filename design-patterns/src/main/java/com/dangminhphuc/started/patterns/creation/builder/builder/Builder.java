package com.dangminhphuc.started.patterns.creation.builder.builder;

import com.dangminhphuc.started.patterns.creation.builder.cars.CarType;
import com.dangminhphuc.started.patterns.creation.builder.components.Engine;
import com.dangminhphuc.started.patterns.creation.builder.components.GPSNavigator;
import com.dangminhphuc.started.patterns.creation.builder.components.Transmission;
import com.dangminhphuc.started.patterns.creation.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}