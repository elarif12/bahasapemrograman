import java.util.*;
import java.lang.Math;

public class tugas14julimenumakanan {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] menumakanan = new String[10];
        int[] banyakpesanan = new int[10];
        int menu;
        int x;
        int y;
        
        x = 1;
        y = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Pesan Nasi Goreng Biasa");
            System.out.println("2. Pesan Nasi Goreng Seafood");
            System.out.println("3. Pesan Nasi Goreng Istimewa");
            System.out.println("0. Keluar");
            menu = input.nextInt();
            System.out.println(menu);
            if (menu == 1) {
                menumakanan[x] = "Jumlah Pesanan Nasi Goreng Biasa = ";
                System.out.print("Jumlah = ");
                banyakpesanan[x] = input.nextInt();
            } else {
                if (menu == 2) {
                    menumakanan[x] = "Jumlah Pesanan Nasi Goreng Seafood = ";
                    System.out.print("Jumlah = ");
                    banyakpesanan[x] = input.nextInt();
                } else {
                    if (menu == 3) {
                        menumakanan[x] = "Jumlah Pesanan Nasi Goreng Istimewa = ";
                        System.out.print("Jumlah = ");
                        banyakpesanan[x] = input.nextInt();
                    }
                }
            }
            x = x+1;
        } while (menu > 0);
        for (y = 1; y <= x - 2; y++) {
            System.out.print(menumakanan[y]);
            System.out.println(banyakpesanan[y]);
        }
    }
}
