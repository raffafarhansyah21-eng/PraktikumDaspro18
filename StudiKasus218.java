import java.util.Scanner;

public class StudiKasus218 {
    public static void main(String[] args) {
        Scanner scanner18 = new Scanner(System.in);

        System.out.print("Nama mahasiswa \t\t\t\t: ");
        String nama = scanner18.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = scanner18.nextLine();
        System.out.print("Jumlah dokumen \t\t\t\t: ");
        int jumlahDokumen = scanner18.nextInt();
        System.out.print("Peringkat juara \t\t\t: ");
        int peringkatJuara = scanner18.nextInt();
        System.out.print("Status pendanaan PKM (1=lolos, 0=tidak): ");
        int statusPkm = scanner18.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen >= 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurangDoc = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDoc + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Bukan peraih juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            if (statusPkm == 1) {
                if (jumlahDokumen >= 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurangDoc = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDoc + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status: Jenis kegiatan Lainnya tidak memperoleh dana penghargaan.");
        }

        scanner18.close();
    }
}