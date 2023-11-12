public class PilotHonda extends Car{
    private double volume;

    private String color;

    public PilotHonda(int year, String country, double volume, String color) {
        super(year, country);
        this.color = color;
        this.volume = volume;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("VOLUME: " + volume + "\nCOLOR: " + color + "\nPILOT HONDA");
    }
}
