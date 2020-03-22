

public class Trolleybus extends Transport{
    public Trolleybus (String typeOf){
        super(typeOf);
        this.capacity = 50;
        this.speed = 40;
        this.sayTypeOf();
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




