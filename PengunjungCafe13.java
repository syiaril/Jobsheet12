public class PengunjungCafe13 {
    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Meja nomor " + nomorMeja);        
        System.out.println("Daftar nama pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
        // for (int i = 0; i < namaPengunjung.length; i++) {
        //     System.out.println("- " + namaPengunjung[i]);
        // }
    }

    public static void main(String[] args) {
        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(5, tamu);
        // daftarPengunjung();
        // daftarPengunjung("Ali", "Budi", "Citra");
        // daftarPengunjung("Andi");
        // daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
