public class Laptop extends Perangkat{
    protected boolean webcam;
    protected String teks;
    public Laptop(String drive, int ram, Double processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
@Override
public void informasi() {
    if(webcam==true){
        teks=" terdapat Webcam";
    }
    else{
        teks="tidak terdapat Webcam";
    }
    System.out.println("Laptop ini memiliki tipe drive" + drive + " dengan ram sebanyak"
    +ram+" GB dan processor secepat "+ processor+" GHZ. selain itu laptop ini juga"+ teks);
}
public void bukagame(String nama_game){
    System.out.println("Laptop berhasil membuka game"+ nama_game);
}
public void kirimEmail(String nama_email){
    System.out.println("Laptop  ini berhasil mengirimkan e-mail ke"+ nama_email);
}
public void kirimEmail01(String namaemail1, String namaemail2){
    System.out.println("Laptop ini berhasil mengirimkan e-mail ke"+ namaemail1+" dan ke"+ namaemail2);
}

}
