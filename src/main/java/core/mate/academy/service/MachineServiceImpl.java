package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl <M extends Machine> implements MachineService<M> {

    @Override
    public List<M> getAll(Class<? extends M> type) {
        if(type == Bulldozer.class) {
            return (List<M>) new BulldozerProducer().get();
        } else if (type == Truck.class) {
            return (List<M>) new TruckProducer().get();
        } else if (type == Excavator.class) {
            return (List<M>) new ExcavatorProducer().get();
        } else {
            throw new IllegalArgumentException("Unsupported machine type: " + type);
        }
    }

    @Override
    public void fill(List<M> machines, M value) {

    }

    @Override
    public void startWorking(List<Excavator> machines) {

    }
}
