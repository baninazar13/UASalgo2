
package Binary;

public class BinaryApp {
    
    public static void main (String [] args) {
        
        BinaryTree tree = new BinaryTree();
        
        BinaryNode siNode;
        
        siNode = new BinaryNode(60);
        tree.insert(siNode);
        
        siNode = new BinaryNode(80);
        tree.insert(siNode);
        
        siNode = new BinaryNode(40);
        tree.insert(siNode);
        
        siNode = new BinaryNode(50);
        tree.insert(siNode);
        
        siNode = new BinaryNode(30);
        tree.insert(siNode);

        
        System.out.print("Traversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
    }
    
}
