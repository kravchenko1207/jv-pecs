package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("E1"),
                new Excavator("E2"));
    }
}
