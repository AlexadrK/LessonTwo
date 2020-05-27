

public class Trolleybus extends AbstractTransport {
    public Trolleybus (String model, int capacity, int speed, int consumption, int mileage, int powerReserve, String fuelType, int transportPrice) { //добавть остальные параметры
        super( model, capacity, speed, consumption, mileage, powerReserve, fuelType, transportPrice); //тоже добавить остальные парамеры
        this.sayModel();

//        super(model);
//        this.sayModel();
//        this.capacity = 50;
//        this.speed = 40;

    }

    @Override
    public void ride () {
        this.mileage++;
    }

    @Override
    public void fueling () {
        this.powerReserve++;
        System.out.println("I get power from cable");
    }
}




