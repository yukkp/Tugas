public class Buku {
    private final String isbn;
    private final String judul;
    private final GenreBuku genre;
    private boolean dipinjam;

    public Buku(String isbn, String judul, GenreBuku genre) {
        this.isbn = isbn;
        this.judul = judul;
        this.genre = genre;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean status) {
        this.dipinjam = status;
    }

    public void tampilkanInfo() {
        String namaGenre = (genre != null) ? genre.getNamaGenre() : "Tanpa Genre";
        System.out.println("- [" + isbn + "] " + judul + " | Genre: " + namaGenre);
    }
}
