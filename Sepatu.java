public class Sepatu {
    // Field final
    final String merek;
    final int ukuran;

    // Constructor
    public Sepatu(String merek, int ukuran) {
        this.merek = merek;
        this.ukuran = ukuran;
    }

    // Method yang akan di-overriden oleh subclass
    public void deskripsi() {
        System.out.println("Ini adalah sepatu merek " + merek + " dengan ukuran " + ukuran);
    }
}
