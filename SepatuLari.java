public class SepatuLari extends Sepatu {
    // Field final tambahan
    final String tipe;

    // Constructor dengan super untuk memanggil constructor dari superclass
    public SepatuLari(String merek, int ukuran, String tipe) {
        super(merek, ukuran);
        this.tipe = tipe;
    }

    // Overriding method deskripsi
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sepatu lari merek " + merek + " dengan ukuran " + ukuran + " dan tipe " + tipe);
    }

    // Overloading method deskripsi
    public void deskripsi(String kondisi) {
        System.out.println("Ini adalah sepatu lari merek " + merek + " dengan ukuran " + ukuran + " dan tipe " + tipe + " dalam kondisi " + kondisi);
    }
}
