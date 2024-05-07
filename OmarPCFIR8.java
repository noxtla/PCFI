

public class OmarPCFIR8 {

    ///Miembro de la clase
    private Node head;
    
    ///Constructor
    public OmarPCFIR8() {
        this.head = null;
    }


    ///Metodo para agregar un entero a la lista
    public void add(int data) {
        Node Node1 = new Node(data);
        
        /// el nuevo nodo se convierte en el primer nodo de la lista
        if (head == null) {
            head = Node1;
        } 
        
        ///el método recorre la lista hasta encontrar el último nodo y luego agrega el nuevo nodo después de él
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(Node1);
        }
    }

    // Método para mostrar los números en la lista
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }


    private class Node {
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
        public int getData() {
            return data;
        }
        
        public Node getNext() {
            return next;
        }
        
        public void setNext(Node next) {
            this.next = next;
        }
    }


    public static void main(String[] args) {

        OmarLinkList myList = new OmarLinkList();
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.display();
        
    }
}