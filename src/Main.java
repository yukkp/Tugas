public class Main {
    public static void main(String[] args) {
        // Membuat objek genre.
        GenreBuku gTekno = new GenreBuku("G01", "Teknologi");
        GenreBuku gFiksi = new GenreBuku("G02", "Sains Fiksi");

        // Membuat objek buku yang terhubung dengan genre.
        Buku buku1 = new Buku("978-01", "Pemrograman Java", gTekno);
        Buku buku2 = new Buku("978-02", "Struktur Data", gTekno);
        Buku buku3 = new Buku("978-03", "Dune", gFiksi);

        // Menampilkan daftar buku berdasarkan genre.
        gTekno.tampilkanDaftarBuku();
        System.out.println();
        gFiksi.tampilkanDaftarBuku();

        System.out.println("\n=== INFORMASI BUKU ===");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();

        // Menunjukkan relasi Member dengan Buku.
        System.out.println("\n=== TRANSAKSI MEMBER ===");
        Member mhs1 = new Member("J04001", "Haka");
        mhs1.pinjamBuku(buku1);
        mhs1.kembalikanBuku(buku1);
    }
}
