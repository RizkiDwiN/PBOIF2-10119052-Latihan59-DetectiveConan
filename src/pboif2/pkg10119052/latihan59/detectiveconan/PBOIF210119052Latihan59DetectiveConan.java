package pboif2.pkg10119052.latihan59.detectiveconan;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * anggota detective conan
 * 
 */
public class PBOIF210119052Latihan59DetectiveConan {

    public static void main(String[] args) {
        Karakter karakter =  new DetektifKecil();
        karakter.setNama("Conan Edogawa");
        karakter.tampil();
        karakter.ciri();
         
        Karakter karakter1 =  new TemanShinichi();
        karakter1.setNama("Ran Mouri");
        karakter1.tampil();
        karakter1.ciri();
        
        Karakter karakter2 =  new DetektifDewasa();
        karakter2.setNama("kogoro mouri");
        karakter2.tampil();
        karakter2.ciri();
        
        Karakter karakter3 =  new SahabatRan();
        karakter3.setNama("Sonoko Suzuki");
        karakter3.tampil();
        karakter3.ciri();
    }
    
}
