public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class SepatuLari
        SepatuLari sepatuLari = new SepatuLari("Nike", 42, "Running");
        sepatuLari.deskripsi(); // Memanggil method overriding

        // Memanggil method overloading
        sepatuLari.deskripsi("baru");

        System.out.println();

        // Membuat objek dari class SepatuFormal
        SepatuFormal sepatuFormal = new SepatuFormal("Adidas", 40, "Hitam");
        sepatuFormal.deskripsi(); // Memanggil method overriding

        System.out.println();

        // Membuat objek dari class SepatuSantai
        SepatuSantai sepatuSantai = new SepatuSantai("Converse", 38, "Sneakers");
        sepatuSantai.deskripsi(); // Memanggil method overriding

        System.out.println();

        // Membuat objek dari class SepatuBoot
        SepatuBoot sepatuBoot = new SepatuBoot("Caterpillar", 44, "Leather");
        sepatuBoot.deskripsi(); // Memanggil method overriding
    }
}
