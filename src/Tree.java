import org.omg.CORBA.NO_IMPLEMENT;

public class Tree {
    Node root;

    public void add(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
        } else {
            Node cerrent = root;
            Node perent = null;
            while (true) {
                perent = cerrent;
                if (value < perent.value) {
                    cerrent = cerrent.left;
                    if (cerrent == null) {
                        perent.left = node;
                        return;
                    }
                } else {
                    cerrent = cerrent.right;
                    if (cerrent == null) {
                        perent.right = node;
                        return;
                    }
                }
            }
        }

    }

    public Node find(int val) {
        Node current = root;
        while (current.value != val) {
            if (current.value > val) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int val) {
        Node newNood = new Node(val);
        if (root == null) {
            root = newNood;
        } else {
            Node current = root;
            Node parent;
            while (true){
                parent=current;
                if (val<current.value){
                    current=current.left;
                    if (current==null){
                        parent.left=newNood;
                        return;
                    }
                }else {
                    current=current.right;
                    if (current==null){
                        parent.right=newNood;
                        return;
                    }
                }
            }
        }
    }

    public void showTree(Node node) {
        if (node != null) {
            showTree(node.left);
            System.out.println(node);
            ;
            showTree(node.right);
        }
    }
}
