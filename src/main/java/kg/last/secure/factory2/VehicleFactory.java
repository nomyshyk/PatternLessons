package kg.last.secure.factory2;

public class VehicleFactory {
    public Vehicle getVehicle(int type){
        if(type == 1){
            return new Car();
        } else if (type == 2){
            return new Velo();
        }
        return null;
    }
}
