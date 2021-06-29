
package Queue;

public class AntrianApp {
    
    public static void main(String []args) {
        String nama = "Muhamad Bani Nazar";
        
        
        Antrian antrian = new Antrian(10);
        
        antrian.enqueue(113);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.println("nama saya adalah " + nama);
        System.out.println();
        antrian.enqueue(70);
        antrian.display();
        System.out.println("nilai yang dikeluarkan = " +antrian.peek());
        antrian.dequeue();
        antrian.display();
        
        System.out.println("nilai yang yang paling depan = " +antrian.peek());
    }
    
}
