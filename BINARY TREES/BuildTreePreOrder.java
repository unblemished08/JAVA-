public class BuildTreePreOrder {
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

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=buildTree(nodes);
        System.out.println(root.data);
    }
}