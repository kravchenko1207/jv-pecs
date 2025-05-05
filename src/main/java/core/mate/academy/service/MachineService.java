package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

/**
 * Parameterize this service and add its implementation in a separate class.
 */
public interface MachineService<M> {

    /**
     * Return the list of machines.
     * In the implementation of this method please use your MachineProducer implementations
     * See that 'Class type' is not parametrized.
     * Consider to parametrize this Class< PARAMETRIZE_ME > with specific wildcard bounding
     *
     * @param type - any class of Machine sub class. For example: Truck.class or Bulldozer.class
     * @return the list of machines
     */
    List<M> getAll(Class <? extends M> type);

    /**
     * Fill the machines list with passed value
     * Replace the Object with parametrized value.
     * This method should be able to work well with any type of machine passed as 'value'
     *
     * @param machines - list of machines to be filled with value
     * @param value    - any object of machine sub class
     */
    void fill(List<M> machines, M value);

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of trucks.
     *
     * @param machines - the list of machines
     */
    void startWorking(List<Excavator> machines);
}
