package coding_ninjas.data_structures_in_java.oops_part_two.protected_keyword.different_package;

public class PickUpTruck {
    String name;
    int loadingCapacity;
    int personCapacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    public int getPersonCapacity() {
        return personCapacity;
    }

    public void setPersonCapacity(int personCapacity) {
        this.personCapacity = personCapacity;
    }

    public void print() {
        // try to access maxSpeed which is member of Vehicle class.
        System.out.println("inside the PickupTruck try to access maxSpeed from Vehicle class");
        Vehicle vehicle = new Vehicle();
        vehicle.maxSpeed = 100;
        vehicle.setColor("Shine Black");
        String fromVehicle = vehicle.toString();
        System.out.println(fromVehicle + " :: " + this);
    }

    @Override
    public String toString() {
        return "PickUpTruck {" +
                "name = '" + getName() + '\'' +
                ", loadingCapacity = " + getLoadingCapacity() +
                ", personCapacity = " + getPersonCapacity() +
                '}';
    }
}
