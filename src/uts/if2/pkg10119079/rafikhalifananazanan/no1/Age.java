package uts.if2.pkg10119079.rafikhalifananazanan.no1;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class Age {
    private int yearBirth,yearNow;
    private final String red = "\u001B[31m";
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;   
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        String tandanyaKamu;
        
        if (0 <= umur  && umur <= 5) {
            tandanyaKamu = "LAGI LUCU-LUCU NYA";
        }else if(5 < umur && umur <= 10){
            tandanyaKamu = "MASIH ANAK-ANAK";
        }else if(10 < umur && umur <= 13){
            tandanyaKamu = "MASIH REMAJA";
        }else if(13 < umur && umur <=19){
            tandanyaKamu = "ALAY";
        }else if(19 < umur && umur <= 29){
            tandanyaKamu = "LAGI GALAU NYARI JODOH";
        }else if(29 < umur && umur <= 35){
            tandanyaKamu = "LAGI SIBUK NYARI UANG";
        }else if(35 < umur && umur <= 150){
            tandanyaKamu = "SUDAH TUA";
        }else{
            tandanyaKamu = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        
        return red + tandanyaKamu;
    }
    
}    