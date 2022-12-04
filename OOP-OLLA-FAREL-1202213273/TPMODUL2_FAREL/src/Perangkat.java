public class Perangkat {
    protected String drive;
    protected int ram;
    protected double processor;

    public Perangkat(String drive, int ram, Double processor) {
        this.drive=drive;
        this.ram=ram;
        this.processor=processor;
    }
    public void informasi() {
        System.out.println("perangkat tidak diketahui memiliki drive type "
        + drive +" dengan ram sebesar " + ram + " GB dan processor secepat "+ processor + " Ghz");
    }
}
