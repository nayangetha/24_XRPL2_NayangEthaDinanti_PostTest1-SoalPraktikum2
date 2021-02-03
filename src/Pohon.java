
//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;


public class Pohon {
    
    //deklarasi variabel
    String nama;
    int tinggi;
    
    //Inisialisasi objek input dari class scanner   
    Scanner input=new Scanner(System.in);
    
    //method void setNama
    void setNama(){
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
    }
    
    //method void setTinggi
    void setTinggi(){
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
    }
    
    //method non void String getNama
    String getNama(){
        //pengembalian nilai nama
        return nama;
    }
    
    //method non void Integer getTinggi
    int getTinggi(){
        //pengembalian nilai tinggi
        return tinggi;
    }
}
