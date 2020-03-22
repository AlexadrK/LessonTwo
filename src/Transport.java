
public abstract class Transport {
    protected int capacity;  //вместимость
    protected int speed;   //скорость
    protected int consumption;  //расход топлива
    protected int  mileage; // пробег
    protected int powerReserve; //запас хода
    private String fuelType;
    private String typeOf;

    public Transport(int capacity, int speed, int consumption, int mileage, int powerReserve, String fuelType, String typeOf) {
        this.capacity = capacity; //вместимость
        this.speed = speed;  //скорость
        this.consumption = consumption; //расход топлива
        this.mileage =  mileage; // пробег
        this.powerReserve = powerReserve; //запас хода
        this.fuelType = fuelType;  //тип топлива
        this.typeOf = typeOf; //тип транспорта
    }

    public Transport (String typeOf, String fuelType){
        this (60,50,20,300,100,fuelType,typeOf);
       //this(40,60,15,fuelType,typeOf);

    }

    public Transport(String typeOf) {

    }

    public abstract void ride();  //ехать
    public abstract void fueling(); //заправка

    public void sayTypeOf(){
        System.out.println("My type is " + this.typeOf + " capacity " + this.capacity + " speed " + this.speed  ); //+ "capacity" + this.capacity + "speed" + this.speed + "consumption" + this.consumption
    }



}
