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

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int i : harga) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(5, tamu);
        // daftarPengunjung();
        // daftarPengunjung("Ali", "Budi", "Citra");
        // daftarPengunjung("Andi");
        // daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

        int total1 = hitungTotalBelanja(15000);
        int total3 = hitungTotalBelanja(15000, 20000, 22000);
        int total5 = hitungTotalBelanja(15000, 20000, 22000, 12000, 10000);

        System.out.println("Total 1 item : Rp" + total1);
        System.out.println("Total 3 item : Rp" + total3);
        System.out.println("Total 5 item : Rp" + total5);
    }
}
