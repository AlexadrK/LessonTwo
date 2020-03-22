
public class TransportDepo {
    public static void main(String[] args) {
        Bus bus = new Bus("какойто");
        Trolleybus trolleybus = new Trolleybus("С ветерком");


        Transport[] depo = new Transport[2];
            depo[0] = bus;
            depo[1] = trolleybus;


        for (Transport transport:depo){
            transport.sayTypeOf();
            transport.fueling();
        }

    }

}


