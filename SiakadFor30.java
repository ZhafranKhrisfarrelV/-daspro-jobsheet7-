import java.util.Scanner;

public class SiakadFor30 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int mhsLulus = 0, mhsTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (60 < nilai) {
                mhsLulus++;   
            } else {
                mhsTidakLulus++;
            }
            
        }
        System.out.println("Nilai tertinggi : " + (int) tertinggi);
        System.out.println("Nilai terendah : " + (int   ) terendah);
        System.out.println("Banyak Mahasiswa Yang Lulus : " + (int) mhsLulus);
        System.out.println("Banyak Mahasiswa Yang Tidak Lulus : " + (int) mhsTidakLulus);


        sc.close();
    }
    
}
