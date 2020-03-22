
public class Tram extends Transport {
    private String fuelType = "electricity";

    public Tram (int capacity, String fuelType, String typeOf) {
        //super(10,20,30,40,50,"A","B");
        super (fuelType, typeOf);
        //this.fuelType = fuelType;




    }

    @Override
    public void ride() {
        this.consumption--;
    }

    @Override
    public void fueling() {
        this.mileage++;
        System.out.println("I get power from cable");

    }
}
