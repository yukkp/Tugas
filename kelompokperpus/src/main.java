public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi Entitas GenreBuku secara independen/mandiri
        GenreBuku gTekno = new GenreBuku("G01", "Teknologi");
        GenreBuku gFiksi = new GenreBuku("G02", "Sains Fiksi");

        // 2. Inisialisasi Buku yang dihubungkan ke GenreBuku
        Buku buku1 = new Buku("978-01", "Pemrograman Java", gTekno);
        Buku buku2 = new Buku("978-02", "Struktur Data", gTekno);
        Buku buku3 = new Buku("978-03", "Dune", gFiksi);

        // 3. Menampilkan daftar buku langsung melalui Entitas GenreBuku
        gTekno.tampilkanDaftarBuku();
        System.out.println();
        gFiksi.tampilkanDaftarBuku();

        System.out.println("\n=== TRANSAKSI MEMBER ===");
        Member mhs1 = new Member("J04001", "Haka");
        mhs1.pinjamBuku(buku1);
        mhs1.kembalikanBuku(buku1);
    }
}