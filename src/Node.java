

public class Node {
    int value;
    Node left;
    Node right;

    @Override
    public String toString() {
        String str = String.valueOf(value);
        return str;
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void showNode(){
        System.out.println(value);
    }
}
