import java.util.Scanner;

public class HitungBalok13 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            // int p, l, t, L, vol;
    
            System.out.print("Masukkan panjang: ");
            int p = input.nextInt();
    
            System.out.print("Masukkan lebar: ");
            int l = input.nextInt();
    
            System.out.print("Masukkan tinggi: ");
            int t = input.nextInt();
    
            // L = hitungLuas(p, l);
            // System.out.println("Luas persegi panjang adalah " + hitungLuas(p, l));
    
            System.out.println("Luas permukaan balok adalah " + hitungLuasPermukaanBalok(p, l, t));
            // vol = hitungVolume(t, p, l);
            System.out.println("Volume balok adalah " + hitungVolume(t, p, l));
        }
        input.close();
    }
}
