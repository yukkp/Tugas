public class Buku {
    private String isbn;
    private String judul;
    private GenreBuku genre;
    private boolean dipinjam;

    public Buku(String isbn, String judul, GenreBuku genre) {
        this.isbn = isbn;
        this.judul = judul;
        this.genre = genre;
        this.dipinjam = false;
        
        // Otomatis menautkan buku ke entitas GenreBuku saat dibuat
        if (genre != null) {
            genre.tambahBukuKeGenre(this);
        }
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
        String namaG = (genre != null) ? genre.getNamaGenre() : "Tanpa Genre";
        System.out.println("- [" + isbn + "] " + judul + " | Genre: " + namaG);
    }
}