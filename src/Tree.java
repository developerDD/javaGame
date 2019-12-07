import org.omg.CORBA.NO_IMPLEMENT;

public class Tree {
    Node root;

    public void add(int value){
        Node node = new Node(value);
        if (root==null){
            root=node;
        }else {
            Node cerrent =root;
            Node perent=null;
            while (true){
                perent=cerrent;
                if (value<perent.value){
                    cerrent=cerrent.left;
                    if (cerrent==null){
                        perent.left=node;
                        return;
                    }
                }else {
                    cerrent=cerrent.right;
                    if (cerrent==null){
                        perent.right=node;
                        return;
                    }
                }
            }
        }

    }

    public Node find(int val){
        Node cerrent = root;
        while (cerrent.value!=val){
            if (cerrent.value<val){
                cerrent=cerrent.left;
            }else {
                cerrent=cerrent.right;
            }
            if (cerrent==null){
                return null;
            }
        }
        return cerrent;
    }

    public void showTree(Node node){
        if (node!=null){
            showTree(node.left);
            System.out.println(node);;
            showTree(node.right);
        }
    }
}
