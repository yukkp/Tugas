import java.util.ArrayList;
import java.util.List;

public class GenreBuku {
    private final String kodeGenre;
    private final String namaGenre;
    private final List<Buku> daftarBuku;

    public GenreBuku(String kodeGenre, String namaGenre) {
        this.kodeGenre = kodeGenre;
        this.namaGenre = namaGenre;
        this.daftarBuku = new ArrayList<>();
    }

    public String getNamaGenre() {
        return namaGenre;
    }

    public void tambahBukuKeGenre(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        System.out.println("=== Genre " + kodeGenre + ": " + namaGenre + " ===");

        if (daftarBuku.isEmpty()) {
            System.out.println("(Belum ada buku di genre ini)");
        } else {
            for (Buku buku : daftarBuku) {
                System.out.println("- " + buku.getJudul());
            }
        }
    }
}
