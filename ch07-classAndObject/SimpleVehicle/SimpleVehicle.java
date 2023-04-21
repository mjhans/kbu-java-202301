public class SimpleVehicle{
    private int passenger;
    private int fuelcap;
    private int mpg;

    public SimpleVehicle(){}
    public SimpleVehicle(int p, int f, int m){
        passenger = p;
        fuelcap = f;
        mpg = m;
    }

    public int range(){
        return fuelcap * mpg;
    }
}