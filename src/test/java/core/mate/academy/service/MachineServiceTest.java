package core.mate.academy.service;

import static org.junit.Assert.assertEquals;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MachineServiceTest {
    private static MachineService<Machine> machineService;

    @BeforeClass
    public static void beforeClass() {
        machineService = new MachineServiceImpl();
    }

    @Test
    public void getAll_bulldozerType() {
        List<Machine> actual = machineService.getAll(Bulldozer.class);
        assertEquals("The list should contain elements of type Bulldozer",
                Bulldozer.class, actual.get(0).getClass());
    }

    @Test
    public void getAll_excavatorType() {
        List<Machine> actual = machineService.getAll(Excavator.class);
        assertEquals("The list should contain elements of type Excavator",
                Excavator.class, actual.get(0).getClass());
    }

    @Test
    public void getAll_truckType() {
        List<Machine> actual = machineService.getAll(Truck.class);
        assertEquals("The list should contain elements of type Truck",
                Truck.class, actual.get(0).getClass());
    }

    @Test
    public void getAll_invalidType() {
        List<Machine> actual = machineService.getAll(Machine.class);
        assertEquals("For the unknown class you should return empty list",
                Collections.emptyList(), actual);
    }

    @Test
    public void fill_bulldozerValue() {
        List<Object> machines = new ArrayList<>();
        int randomSize = new Random().nextInt(100);
        for (int i = 0; i < randomSize; i++) {
            machines.add(new Object());
        }
        machineService.fill(machines, new Bulldozer());
        assertEquals("The list size shouldn't change", randomSize, machines.size());
        for (Object machine : machines) {
            assertEquals("The list should contain elements of type Bulldozer",
                    Bulldozer.class, machine.getClass());
        }
    }

    @Test
    public void fill_excavatorValue() {
        List<Object> machines = new ArrayList<>();
        int randomSize = new Random().nextInt(100);
        for (int i = 0; i < randomSize; i++) {
            machines.add(new Object());
        }
        machineService.fill(machines, new Excavator());
        assertEquals("The list size shouldn't change", randomSize, machines.size());
        for (Object machine : machines) {
            assertEquals("The list should contain elements of type Excavator",
                    Excavator.class, machine.getClass());
        }
    }

    @Test
    public void fill_truckValueRandomSize() {
        List<Object> machines = new ArrayList<>();
        int randomSize = new Random().nextInt(100);
        for (int i = 0; i < randomSize; i++) {
            machines.add(new Object());
        }
        machineService.fill(machines, new Truck());
        assertEquals("The list size shouldn't change", randomSize, machines.size());
        for (Object machine : machines) {
            assertEquals("The list should contain elements of type Truck",
                    Truck.class, machine.getClass());
        }
    }

    /**
     * This test will compile in case of proper solution
     */
    @Test
    public void startWorking_bulldozers() {
        List<Bulldozer> bulldozers = List.of(new Bulldozer());
        machineService.startWorking(bulldozers);
    }

    /**
     * This test will compile in case of proper solution
     */
    @Test
    public void startWorking_excavators() {
        List<Excavator> excavators = List.of(new Excavator());
        machineService.startWorking(excavators);
    }

    /**
     * This test will compile in case of proper solution
     */
    @Test
    public void startWorking_trucks() {
        List<Truck> trucks = List.of(new Truck());
        machineService.startWorking(trucks);
    }
}