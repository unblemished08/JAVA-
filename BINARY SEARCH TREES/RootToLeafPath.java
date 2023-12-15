import java.util.*;
public class RootToLeafPath
{
     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root,int val) {
        if(root == null) 
        {
            root=new Node(val);
            return root;
        }

        if(root.data > val) {
            //left subtree
            root.left=insert(root.left,val);
        } else {
            //right subtree
            root.right=insert(root.right,val);
        }

        return root;
    }

    public static void roottoleaf(Node root,ArrayList<Integer> path) {
        if(root==null) 
            return;
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printpath(path);
        }

        roottoleaf(root.left,path);
        roottoleaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static void printpath(ArrayList<Integer> path) {
        for(int i=0; i<path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++) {
            root=insert(root,values[i]);
        }

       roottoleaf(root,new ArrayList<>());
    }
}