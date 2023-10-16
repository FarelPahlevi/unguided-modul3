//farel pahlevi azhar
//2211103008
//S1SI06B
public class Pegawai {
    private int gajiPokok, totalGaji, hariLembur;
    private String NIP, nama, alamat;

    public Pegawai(){
        System.out.println("Konstruktor Pegawai berjalan...");
    }
    public void setNip(String nip){
        NIP = nip;
    }
    public void setNama(String Nama){
        nama = Nama;
    }
    public void setAlamat(String Alamat){
        alamat = Alamat;
    }
    public void setGaji(int gaji){
        gajiPokok = gaji;
        hariLembur = 0;
        this.totalGaji = gajiPokok + (hariLembur * (gaji/4));
    }
    public void setGaji(int lembur, int gaji){
        hariLembur = lembur;
        gajiPokok = gaji;
        this.totalGaji = gajiPokok + (hariLembur * (gaji/4));
    }
    public String getNIP(){
        return NIP;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void cetak(){
        System.out.println("Nama Pegawai : "+getNama());
        System.out.println("NIP : "+getNIP());
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Gaji Pokok : "+gajiPokok);
        System.out.println("Hari Lembur : "+hariLembur);
        System.out.println("Total Gaji : "+totalGaji);
    }
}
