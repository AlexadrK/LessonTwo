
public class TransportDepo {
    public static void main(String[] args) {
        Bus ikarusBus = new Bus("Ikarus", 50, 40, 20, 0, 100, "disel", 1000);
        Bus zilBus= new Bus("ZIL", 80, 40,20, 0, 100, "disel", 2000);
        Bus liazBus = new Bus("Liaz", 70, 40, 30, 0, 120, "disel", 3000);

        Trolleybus uralTrallebus = new Trolleybus("Ural", 80, 40, 1000, 0, 1000, "electricity", 3000 );
        Trolleybus gazTrolleybus = new Trolleybus("", 90, 0, 40, 0, 1000, "electricity", 3500);
        Trolleybus btzTrollebus = new Trolleybus("BTZ-52763", 100, 50, 1000, 0, 1000, "electricity", 4000 );

        Tram konstalTram = new Tram("Konstal", 100, 60, 2000, 0, 1000, "electricity", 5000 );
        Tram newagTram1 = new Tram("Newag", 130, 65, 2000, 0, 1000, "electricity", 5500);
        Tram protramTram = new Tram("Protram", 150, 70, 2000, 0, 1000, "electricity", 7000);

        AbstractTransport[] depo = new AbstractTransport[10];
            depo[0] = ikarusBus;
            depo[1] = zilBus;
            depo[2] = liazBus;
            depo[3] = uralTrallebus;
            depo[4] = gazTrolleybus;
            depo[5] = btzTrollebus;
            depo[6] = konstalTram;
            depo[7] = newagTram1;
            depo[8] = protramTram;

        for (AbstractTransport abstractTransport :depo){
            abstractTransport.sayModel();
            abstractTransport.fueling();
            abstractTransport.ride();
        }

    }

}


