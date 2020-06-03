
public class Bus extends AbstractTransport implements Fueling{
    public Bus(String model, int capacity, int speed, int consumption, int mileage, int powerReserve, String fuelType, int transportPrice) { //добавть остальные параметры
        super( model, capacity, speed, consumption, mileage, powerReserve, fuelType, transportPrice); //тоже добавить остальные парамеры
        this.sayModel();

//        this.capacity = 50;
//        this.speed = 80;
//        this.consumption = 20;
    }


    @Override
        public void ride () {
            this.mileage++;
            this.capacity--;
        }

    @Override
    public void FuelingOn() {
        this.powerReserve--;
    }

       /* @Override
        public void fueling () {
            this.powerReserve--;
        }*/
    }
