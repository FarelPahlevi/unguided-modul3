import java.io.*;
public class ProjectDataPegawai {
    public static void main(String[] args) {
        Pegawai peg = new Pegawai();
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        try{
            System.out.println("Masukkan Nama Pegawai : ");
            peg.setNama(br.readLine());
            System.out.println("Masukkan NIP : ");
            peg.setNip(br.readLine());
            System.out.println("Masukkan Alamat : ");
            peg.setAlamat(br.readLine());
            peg.setGaji(5000000);
            peg.cetak();
            System.out.println();

            System.out.println("Masukkan Nama Pegawai : ");
            peg.setNama(br.readLine());
            System.out.println("Masukkan NIP : ");
            peg.setNip(br.readLine());
            System.out.println("Masukkan Alamat : ");
            peg.setAlamat(br.readLine());
            peg.setGaji(10, 5000000);
            peg.cetak();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}