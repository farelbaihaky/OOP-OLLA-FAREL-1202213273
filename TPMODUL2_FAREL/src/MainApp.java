public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat (" seagate",16, 5.00);
        perangkat1.informasi();
        System.out.println("");

        Laptop laptop = new Laptop(" SAMSUNG", 64, 3.5, true);
        laptop.informasi();
        laptop.bukagame(" Battlefield V");
        laptop.kirimEmail(" farel@gmail.com");
        laptop.kirimEmail01(" alexturner@gmail.com", " doremi@gmail.com");
        System.out.println("");

        Handphone handphone = new Handphone(" Advan", 12, 3.6, true);
        handphone.informasi();
        handphone.telfon(628334565);
        handphone.kirimSMS(62456511, 628221333);
        handphone.kirimSMS(627540192, 625443566);
        System.out.println("");
    }
}
