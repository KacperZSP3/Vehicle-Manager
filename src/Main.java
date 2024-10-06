interface Vehicle {
    void describe();
}

class Bicycle implements Vehicle {
    public void describe() {
        System.out.println("To jest rower, który jest napędzany siłą mięśni.");
    }
}

class Car implements Vehicle {
    public void describe() {
        System.out.println("To jest samochód, który ma cztery koła i silnik.");
    }
}

class Motorcycle implements Vehicle {
    public void describe() {
        System.out.println("To jest motocykl, który ma dwa koła i silnik.");
    }
}

/*class VehicleManager { //część 1 implementacji interfejsu
    public void describeVehicle(Vehicle vehicle) {
        vehicle.describe();  // Wywołanie metody 'describe' dowolnego pojazdu
    }
}
*/

class VehicleManager { //część 2 implementacji interfejsu
        private Vehicle vehicle;

        // [1] Konstruktor przypisuje pojazd do pola
    public VehicleManager(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        // [2] Metoda process wywołuje opis pojazdu
        public void process() {
            System.out.println("Rozpoczynam opis pojazdu...");
            this.vehicle.describe();  // [3] Wywołanie metody describe dla wybranego pojazdu
            System.out.println("Opis pojazdu zakończony.");
        }
    }

/*public class Main { //część 1 implementacji interfejsu
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();

        Vehicle bicycle = new Bicycle();
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        manager.describeVehicle(bicycle);  // Opis roweru
        manager.describeVehicle(car);      // Opis samochodu
        manager.describeVehicle(motorcycle); // Opis motocykla
    }
}*/

public class Main { //część 2 implementacji interfejsu
    public static void main(String[] args) {

        Vehicle bicycle = new Bicycle(); // Tworzymy obiekt roweru
        VehicleManager manager = new VehicleManager(bicycle); // Tworzymy VehicleManager z rowerem
        manager.process();  // Wywołujemy metodę process, aby opisać rower
    }
}