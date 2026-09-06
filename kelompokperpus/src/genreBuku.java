import java.util.ArrayList;
import java.util.List;

public class GenreBuku {
    private String kodeGenre;
    private String namaGenre;
    private List<Buku> daftarBuku; // Menyimpan daftar buku dalam genre ini

    public GenreBuku(String kodeGenre, String namaGenre) {
        this.kodeGenre = kodeGenre;
        this.namaGenre = namaGenre;
        this.daftarBuku = new ArrayList<>();
    }

    public String getNamaGenre() {
        return namaGenre;
    }

    // Method mandiri untuk mengelola koleksi buku per genre
    public void tambahBukuKeGenre(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        System.out.println("=== Kategori Genre: " + namaGenre + " ===");
        if (daftarBuku.isEmpty()) {
            System.out.println("(Belum ada buku di genre ini)");
        } else {
            for (Buku b : daftarBuku) {
                System.out.println("- " + b.getJudul());
            }
        }
    }
}