
public abstract class AbstractTransport {
    protected int capacity;  //вместимость
    protected int speed;   //скорость
    protected int consumption;  //расход топлива
    protected int  mileage; // пробег
    protected int powerReserve; //запас хода
    private String fuelType; //тип топлива
    private String model; //тип транспорта
    private  int transportPrice; //цена еденицы транспорта

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public int getConsumption() {
        return consumption;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPowerReserve() {
        return powerReserve;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getModel() {
        return model;
    }

    public int getTransportPrice() {
        return transportPrice;
    }

    public AbstractTransport(String model, int capacity, int speed, int consumption, int mileage, int powerReserve, String fuelType, int transportPrice) {
        this.capacity = capacity; //вместимость
        this.speed = speed;  //скорость
        this.consumption = consumption; //расход топлива
        this.mileage =  mileage; // пробег
        this.powerReserve = powerReserve; //запас хода
        this.fuelType = fuelType;  //тип топлива
        this.model = model; //тип транспорта
        this. transportPrice = transportPrice; //
    }

//    public abstractTransport(String typeOf, String fuelType){ //
//        this (60,50,20,300,100,fuelType,typeOf);
//       //this(40,60,15,fuelType,typeOf);
//
//    }


    public AbstractTransport(String model) {
        this.model = model;
    }

    public AbstractTransport(int i, int i1, int i2, int i3, int i4, String fuelType, String model) {
    }

    public abstract void ride();  //ехать
    //public abstract void fueling(); //заправка

    public void sayModel(){
        System.out.println("My type is " + this.model + " capacity " + this.capacity + " speed " + this.speed  ); //+ "capacity" + this.capacity + "speed" + this.speed + "consumption" + this.consumption
    }



}
