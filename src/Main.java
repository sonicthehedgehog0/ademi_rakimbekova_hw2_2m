import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car PilotHonda = createCar("PilotHonda");
        Car CamryToyota = createCar("CamryToyota");
        Car SportageKia= createCar("SportageKia");
        PilotHonda.print();
        CamryToyota.print();
        SportageKia.print();

        Printable printables[] = {PilotHonda, CamryToyota, SportageKia};
        for (int i = 0; i < printables.length; i++) {
            if (printables[i] instanceof Car) {
                printables[i].print();
            }
        }
    }
   public static Car createCar(String ClassName){
       switch (ClassName){
           case "PilotHonda":
               Car PilotHonda = new PilotHonda(2019, "Canada", 3.0, "Black");
                return PilotHonda;
            case "CamryToyota":
                Car CamryToyota = new CamryToyota(2018, "Japan", 3.5, "Sedan");
                return CamryToyota;
            case "SportageKia":
                Car SportageKia = new SportageKia(2020,"Korea", 2.7,"Kia Motors");
               return SportageKia;
        }
        return null;
    }
}