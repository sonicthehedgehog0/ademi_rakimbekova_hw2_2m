public class SportageKia extends Car{

    private double volume;
    private String factory;

    public SportageKia(int year, String country, double volume, String factory) {
        super(year, country);
        this.factory = factory;
        this.volume = volume;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("VOLUME: " + volume + "\nFACTORY: " + factory + "\nSPORTAGE KIA");

    }
}
