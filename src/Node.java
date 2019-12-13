

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
    //вывод узла в виде дерева
    public void print() {
        print("", this, false);
    }

    public void print(String prefix, Node n, boolean isLeft) {
        if (n != null) {
            System.out.println (prefix + (isLeft ? "|-- " : "\\-- ") + n.value);
            print(prefix + (isLeft ? "|   " : "    "), n.left, true);
            print(prefix + (isLeft ? "|   " : "    "), n.right, false);
        }
    }
}
