package MODUL2_FAREL;

public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi=jumlahKursi;
        this.biaya=biaya;
    }
    public void informasi() {
        System.out.println("Transportasi air jenis kapal dengan kursi berjumlah "
        + jumlahKursi +" ditetapkan dengan biaya sekitar " + biaya + );
    }
}
