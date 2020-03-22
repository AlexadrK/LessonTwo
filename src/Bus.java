
public class Bus extends Transport {
    public Bus(String typeOf) {
        super(typeOf);
        this.sayTypeOf();
        this.capacity = 50;
        this.speed = 80;

    }



    @Override
        public void ride () {
            this.mileage++;
            this.capacity--;
        }

        @Override
        public void fueling () {
            this.powerReserve++;
        }
    }
