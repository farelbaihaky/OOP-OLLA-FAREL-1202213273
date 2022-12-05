package MODUL2_FAREL;

public class Kapal extends TransportasiAir {
    protected String mesin;
    protected String teks;
    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
@Override
public void informasi() {
    if(mesin==true){
        teks=" terdapat mesin";
    }
    else{
        teks="tidak terdapat mesin";
    }
    System.out.println(+ teks);
}
public void bukagame(String kecepatan){
    System.out.println("Transportasi air jenis kapal dengan kursi berjumlah "+ kecepatan);
}
public void kirimEmail(String nama_email){
    System.out.println("Laptop  ini berhasil mengirimkan e-mail ke"+ nama_email);
}
public void kirimEmail01(String namaemail1, String namaemail2){
    System.out.println("Laptop ini berhasil mengirimkan e-mail ke"+ namaemail1+" dan ke"+ namaemail2);
}  
}
