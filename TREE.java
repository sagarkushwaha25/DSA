import java.util.*;

class Node {
    Node left,right;
    int data;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TREE {
    static class Node {
        Node left,right;
        int data;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = insert();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
    }

    
    static Node insert() {
        Node root = null;
        System.out.println("Enter data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("enter left child: "+root.data);
        root.left = insert();
        System.out.println("enter right child: "+root.data);
        root.right = insert();
        return root;
        
    }


    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    // public static int height(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int leftheight = height(root.left);
    //     int rightheight = height(root.right);

    //     int myHeight = Math.max(leftheight, rightheight) + 1;
    //     return myHeight;
    // }
    

    // public static int count(Node root) {
    //     if(root == null) {
    //         return 0;
    //     }
    //     int leftcount = count(root.left);
    //     int rightcount = count(root.right);

    //     return leftcount + rightcount + 1;
    // }


    // public static int sum(Node root) {
    //     if(root == null) {
    //         return 0;
    //     }
    //     int leftsum = sum(root.left);
    //     int rightsum = sum(root.right);

    //     return leftsum + rightsum + root.data;
    // }


    // public static void levelorder(Node root) {
    //     Queue<Node> q = new LinkedList<>();
    //     q.add(root);
    //     q.add(null);

    //     while(!q.isEmpty()) {
    //         Node curr = q.poll();
    //         if (curr == null) {
    //             System.out.println();
    //             if(q.isEmpty()) {
    //                 return;
    //             } else {
    //                 q.add(null);
    //                 System.out.println();
    //             }
    //         }
    //         System.out.print(curr.data+" ");
    //         if(curr.left != null) {
    //             q.add(curr.left);
    //         }
    //         if(curr.right != null) {
    //             q.add(curr.right);
    //         }
    //     }
    // }
    
}
