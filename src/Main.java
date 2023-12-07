import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator kl = new Kalkulator();
        int opsi;
        while (true){
            System.out.println("====Kalkulator====");
            System.out.println("1. Faktorial");
            System.out.println("2. Pangkat");
            System.out.println("3. Bagi");
            System.out.println("4. Kali");
            System.out.println("5. Sisa Bagi");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            opsi = input.nextInt();
            if (opsi == 1){
                System.out.println("Masukkan Angka 1 : ");
                double angka1 = (int) input.nextDouble();
                System.out.println("Hasil : "+kl.faktorial(angka1));
            }
            if (opsi == 2){
                System.out.println("Masukkan Angka 1 : ");
                double angka1 = (int) input.nextDouble();
                System.out.println("Masukkan Angka 2 : ");
                double angka2 = (int) input.nextDouble();
                System.out.println("Hasil : "+kl.pangkat(angka1,angka2));
            }
            if (opsi == 3){
                System.out.println("Masukkan Angka 1 : ");
                double angka1 = (int) input.nextDouble();
                System.out.println("Masukkan Angka 2 : ");
                double angka2 = (int) input.nextDouble();
                System.out.println("Hasil : "+kl.pembagian(angka1,angka2));
            }
            if (opsi == 4){
                System.out.println("Masukkan Angka 1 : ");
                double angka1 = (int) input.nextDouble();
                System.out.println("Masukkan Angka 2 : ");
                double angka2 = (int) input.nextDouble();
                System.out.println("Hasil : "+kl.perkalian(angka1,angka2));
            }
            if (opsi == 5){
                System.out.println("Masukkan Angka 1 : ");
                double angka1 = (int) input.nextDouble();
                System.out.println("Masukkan Angka 2 : ");
                double angka2 = (int) input.nextDouble();
                System.out.println("Hasil : "+kl.sisabagi(angka1,angka2));
            }
            if (opsi == 0){
                System.out.println("SELESAI");
                break;
            }
        }
    }
}