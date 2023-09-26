package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {

    @Test
    void carIsInstanceOfVehicle() {
        Car car = new Car("Ford", "Mustang", 2022);
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carIsCreatedWithFourWheels() {
        Car car = new Car("Ford", "Mustang", 2022);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleIsInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2022);
        assertThat(motorcycle).isInstanceOf(Vehicle.class);
    }

    @Test
    void motorcycleIsCreatedWithTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2022);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carReachesSixtyOnTestDrive() {
        Car car = new Car("Ford", "Mustang", 2022);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleReachesSeventyFiveOnTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2022);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carStopsWhenParkedAfterTestDrive() {
        Car car = new Car("Ford", "Mustang", 2022);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isZero();
    }

    @Test
    void motorcycleStopsWhenParkedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isZero();
    }
}
