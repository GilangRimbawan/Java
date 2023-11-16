public class SepatuSantai extends Sepatu {
    // Field final tambahan
    final String jenis;

    // Constructor dengan super untuk memanggil constructor dari superclass
    public SepatuSantai(String merek, int ukuran, String jenis) {
        super(merek, ukuran);
        this.jenis = jenis;
    }

    // Overriding method deskripsi
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sepatu santai merek " + merek + " dengan ukuran " + ukuran + " dan jenis " + jenis);
    }
}
