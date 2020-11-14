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
public class DetektifDewasa extends Karakter{
    @Override
    public void tampil() {
        System.out.println("nama : "+nama);
    }
    @Override
        public void  ciri(){
        System.out.println("deskripsi : kogoro mouri seorang detektif swasta yang sangat terkenal karena sering memecahkan kasus."
                + " Kogoro ahli dalam judo sementara istrinya adalah seorang pengacara");
        System.out.println("");
        
    }
}
