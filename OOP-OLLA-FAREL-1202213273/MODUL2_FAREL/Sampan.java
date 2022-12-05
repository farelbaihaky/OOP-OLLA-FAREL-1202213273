package MODUL2_FAREL;

public class Sampan {
    protected int layar;
    protected String teks;

    public Handphone(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar=layar;
    }

    @Override
    public void informasi(){
        if(layar==true){
            teks="Terdapat layar";
        }
        else{
            teks="Tidak terdapat layar";
        }
        System.out.println("Transportasi air jenis Sampan dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sekitar Rp." + biaya + teks);
    }

    public void berlayar(){
        System.out.println();
    }
    public void berlabuh(){
        System.out.println();    
    }
    public void berlabuh(int jangkar){
        System.out.println();
    }
}
