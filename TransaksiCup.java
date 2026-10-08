import java.util.Scanner;
public class TransaksiCup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

