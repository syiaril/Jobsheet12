import java.util.Scanner;

public class Kafe13 {
    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }    

        if (jamKunjung >= 14 && jamKunjung <= 16 ) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    
    public static int hitungTotalHarga13(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    
    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int persen = 0;
        
        if (kodePromo.equals("DISKON50")) {
            persen = 50;
        } else if (kodePromo.equals("DISKON30")) {
            persen = 30;
        } else {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            persen += 10;
        }

        return total * persen / 100;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();
        
        System.out.print("Apakah member? (y/n): ");
        String jawab = sc.nextLine();
        boolean member = jawab.equalsIgnoreCase("y");

        System.out.print("Masukkan jam kunjung (0-23): ");
        int jam = sc.nextInt();
        
        Menu(nama, member, jam);
        
        int totalHarga = 0;
        while (true) {
            System.out.print("\nMasukkan nomor menu (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();
            
            if (pilihanMenu == 0) {
                break;
            }
            
            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
                continue;
            }
            
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            if (banyakItem <= 0) {
                System.out.println("Jumlah item tidak valid");
                continue;
            }
            
            totalHarga += hitungTotalHarga13(pilihanMenu, banyakItem);
        }
        
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();
        
        int diskon = hitungDiskon(totalHarga, kodePromo, member);
        int totaBayar = totalHarga - diskon;
        
        
        System.out.println("\n===== RINCIAN PEMBAYARAN =====");
        System.out.println("Total harga      : Rp" + totalHarga);
        System.out.println("Total diskon     : Rp" + diskon);
        System.out.println("Total pembayaran : Rp" + totaBayar);
        
        sc.close();
    }
}