public abstract class Car implements Printable {
    private int year;
    private String country;

    public Car(int year, String country) {
        this.year = year;
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void print() {
        System.out.println("----------------" + "\nYEAR: " + year + "\nCOUNTRY: " + country );
    }
}
