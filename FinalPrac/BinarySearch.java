package FinalPrac;


class Node {
    char data;
    Node left;
    Node right;
}

class BinarySearchTree {
    private Node root = new Node();

    public Node insertKey(Node root, char x) {
        Node newNode = new Node();
        Node p = root;
        newNode.data = x;
        newNode.left = null;
        newNode.right = null;

        if (p == null) {
            return newNode;
        } else if (p.data > newNode.data) {
            p.left = insertKey(p.left, x);
            return p;
        } else if (p.data < newNode.data) {
            p.right = insertKey(p.right, x);
            return p;
        } else {
            return p;
        }
    }

    public void insertBST(char x) {
        root = insertKey(root, x);
    }

    public Node searchBST(char x) {
        Node p = root;

        while (p != null) {
            if (p.data > x) {
                p = p.left;
            } else if (p.data < x) {
                p = p.right;
            } else {
                return p;
            }
        }
        return p;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.printf(" %c", root.data);
            inorder(root.right);
        }
    }

    public void printBST() {
        inorder(root);
        System.out.println();
    }

}

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearchTree bsT = new BinarySearchTree();
        bsT.insertBST('G');
        bsT.insertBST('I');
        bsT.insertBST('H');
        bsT.insertBST('D');
        bsT.insertBST('B');
        bsT.insertBST('M');
        bsT.insertBST('N');
        bsT.insertBST('A');
        bsT.insertBST('J');
        bsT.insertBST('E');
        bsT.insertBST('Q');

        System.out.printf("\nBinary Tree >>> ");
        bsT.printBST();

        System.out.printf("\nBinary Tree >>> ");
        bsT.printBST();


        System.out.printf("Is there \"A\" ? >>> ");
        Node p1 = bsT.searchBST('A');

        if (p1 != null) {
            System.out.printf("Searching Success! Searched key : %c \n", p1.data);
        } else {
            System.out.printf("Searching fail! There is no %c \n", p1.data);
        }

        System.out.printf("Is there \"Z\" ? >>> ");
        Node p2 = bsT.searchBST('Z');

        if (p2 != null) {
            System.out.printf("Searching Success! Searching key: %c \n", p2.data);
        } else {
            System.out.printf("Searching fail! \n");
        }
    }
}
