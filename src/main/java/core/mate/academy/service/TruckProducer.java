package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck modelOne = new Truck();
        Truck modelTwo = new Truck();
        Truck modelTree = new Truck();
        List<Truck> list = List.of(modelOne, modelTwo, modelTree);
        return list;
    }
}