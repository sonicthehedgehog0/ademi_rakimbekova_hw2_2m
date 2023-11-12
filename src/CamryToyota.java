public class CamryToyota extends Car{
    private double volume;
    private String kuzov;

    public CamryToyota(int year, String country, double volume, String kuzov) {
        super(year, country);
        this.volume = volume;
        this.kuzov = kuzov;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("VOLUME: " + volume +
                "\nKUZOV: " + kuzov + "\nCAMRY TOYOTA");

    }
}
