public class SepatuBoot extends Sepatu {
    // Field final tambahan
    final String bahan;

    // Constructor dengan super untuk memanggil constructor dari superclass
    public SepatuBoot(String merek, int ukuran, String bahan) {
        super(merek, ukuran);
        this.bahan = bahan;
    }

    // Overriding method deskripsi
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sepatu boot merek " + merek + " dengan ukuran " + ukuran + " dan bahan " + bahan);
    }
}
