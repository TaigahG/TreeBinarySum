package com.JavaCal;

public class TreeBinarySum {


    public static class Node{
        Node left, right;
        int key;


    }

    public static Node Node(int s){
        Node node = new Node();
        node.key = s;
        node.left = node.right = null;
        return (node);

    }

    static int sumTree(Node root){
        if(root == null){
            return 0;
        }
        return (root.key + sumTree(root.left) + sumTree(root.right));
    }



    public static void main(String args[])
    {

        Node root = Node(1);
        root.left = Node(2);
        root.right = Node(3);
        root.left.left = Node(4);
        int sum = sumTree(root);
        System.out.println(sum);
    }
}
