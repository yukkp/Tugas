public class Member {
    private String idMember;
    private String nama;

    public Member(String idMember, String nama) {
        this.idMember = idMember;
        this.nama = nama;
    }

    public void pinjamBuku(Buku buku) {
        if (!buku.isDipinjam()) {
            buku.setDipinjam(true);
            System.out.println(nama + " berhasil meminjam: " + buku.getJudul());
        } else {
            System.out.println("Maaf, " + buku.getJudul() + " sedang dipinjam!");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (buku.isDipinjam()) {
            buku.setDipinjam(false);
            System.out.println(nama + " berhasil mengembalikan: " + buku.getJudul());
        } else {
            System.out.println("Buku " + buku.getJudul() + " tidak sedang dipinjam.");
        }
    }
}