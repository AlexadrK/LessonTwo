
public class Tram extends AbstractTransport implements Fueling {
    public Tram(String model, int capacity, int speed, int consumption, int mileage, int powerReserve, String fuelType, int transportPrice) {
        super(model, capacity, speed, consumption, mileage, powerReserve, fuelType, transportPrice);
        this.sayModel();
    }
    //private String fuelType = "electricity";


   // public Tram (int capacity, String fuelType, String model) {
     //   super(10,20,30,40,50,"A","B");
        //super (fuelType, typeOf);
        //this.fuelType = fuelType;

     @Override
     public void ride () {
         this.mileage++;
         this.consumption--;
   }

    @Override
    public void FuelingOn() {
        this.powerReserve++;
    }




    /*@Override
    public void fueling () {
        this.mileage++;
        System.out.println("I get power from cable");

    }*/
}
