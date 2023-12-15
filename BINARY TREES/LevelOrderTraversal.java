import java.util.*;
public class LevelOrderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx=-1;
    public static Node buildTree(int nodes[]) {
        idx++;
        if(nodes[idx] == -1) {
            return null;
        }

        Node newnode = new Node(nodes[idx]);
        newnode.left = buildTree(nodes);
        newnode.right = buildTree(nodes);

        return newnode;
    }

    public static void levelOrder(Node root) {
        
        if(root==null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode=q.remove();

            if(currNode==null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.add(currNode.left);

                if(currNode.right!=null)
                    q.add(currNode.right);
            }
        }
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=buildTree(nodes);
        
        System.out.println("LEVELORDER : ");
        levelOrder(root);
    }
}