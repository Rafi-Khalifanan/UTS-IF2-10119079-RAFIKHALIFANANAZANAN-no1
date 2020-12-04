package uts.if2.pkg10119079.rafikhalifananazanan.no1;
import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class UTSIF210119079RAFIKHALIFANANAZANANNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age age = new Age(2018);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");        
        age.setYearBirth(input.nextInt()); 
        System.out.println("");
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
}
