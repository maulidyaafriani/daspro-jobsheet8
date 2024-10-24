package dasprojobsheet8;
import java.util.Scanner;
/**
 * rata
 */
public class RataNilai15Baru {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        float nilaiMhs, totalNilai, rataNilai;
        
       i=1;
       while (i<=5) {
        totalNilai=0;
        System.out.println("Input nilaimahasiswa ke " + i);
        for(j=1;j<=5;j++){
            System.out.print("Nilai ke- " + j + " = ");
            nilaiMhs=sc.nextInt();
            totalNilai+=nilaiMhs;
        }
        rataNilai=totalNilai/5;
        System.out.println("rata rata nilai mahasiswa ke " + i + " adalah " + rataNilai);
        i++;
       }
       sc.close();
    }
}
       