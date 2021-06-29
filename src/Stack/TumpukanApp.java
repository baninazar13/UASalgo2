
package Stack;

public class TumpukanApp {
    
    public static void main (String[] args) {
        
    String nama = "Muhamad Bani Nazar";
    
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(113);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println("nilai teratas = " + tumpukan.peek());
        System.out.println("Nama saya adalah " + nama);
        System.out.println("Nilai yang dihapus = " + tumpukan.peek());
        tumpukan.pop();
        tumpukan.baca();
        System.out.println();
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
               
   }
    
}
