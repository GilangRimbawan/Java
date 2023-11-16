public class SepatuFormal extends Sepatu {
    // Field final tambahan
    final String warna;

    // Constructor dengan super untuk memanggil constructor dari superclass
    public SepatuFormal(String merek, int ukuran, String warna) {
        super(merek, ukuran);
        this.warna = warna;
    }

    // Overriding method deskripsi
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sepatu formal merek " + merek + " dengan ukuran " + ukuran + " dan warna " + warna);
    }
}
