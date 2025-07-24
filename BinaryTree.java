import java.util.*;
class BinaryTree {
    Node root;

    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                q.add(temp.right);
            }
        }
    }
     // Inorder Traversal: Left, Root, Right
    public void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        // Print tree in inorder
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();
    }
}

