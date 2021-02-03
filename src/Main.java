
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //2 variable yang berisi instance dari class "Pohon" dengan nama "cemara" dan "kelapa"
        Pohon cemara, kelapa;
        
        //object
        Pohon tampil = new Pohon();
        
        System.out.println("TANAMANKU");
        System.out.println("");
        
        //pemanggilan method void dari kelas Pohon 
        tampil.setNama();
        tampil.setTinggi();
        
        System.out.println("");
        
        //pemanggilan method non void dari kelas pohon
        System.out.println("Tanamanku adalah "+tampil.getNama()+" Setinggi "+tampil.getTinggi());
        
        
    }
    
}
