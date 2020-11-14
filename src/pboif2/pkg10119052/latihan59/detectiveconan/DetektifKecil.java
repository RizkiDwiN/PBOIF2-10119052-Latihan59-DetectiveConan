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
public class DetektifKecil extends Karakter{
  @Override
    public void tampil() {
        System.out.println("nama: "+nama);
    }
    @Override
        public void ciri(){
            
        System.out.println("deskripsi : Edogawa Konan adalah seorang anggota Grup Detektif Cilik. ");
             System.out.println("Identitas asli Conan Edogawa adalah Shinichi Kudo yang badannya menyusut karena racun APTX 4869 yang diberikan oleh Organisasi Hitam di Tropical Land.");
        System.out.println("");
        
    }  
}
