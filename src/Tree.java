import java.util.Stack;

public class Tree {
    Node root;
    static Integer colNood = 0;

    //добавление в узел
    public void add(int value) {
        Node node = new Node(value);
        colNood++;
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

    //поиск искомого елемента в дереве
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

    //вставка елемента в дерево
    public void insert(int val) {
        Node newNood = new Node(val);
        colNood++;
        if (root == null) {
            root = newNood;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (val < current.value) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNood;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNood;
                        return;
                    }
                }
            }
        }
    }

    //вывод дерева
    public void showTreeColum(Node nood) {
        Stack<Integer> stack = new Stack<Integer>();
        if (nood != null) {
            showTreeColum(nood.left);
            //System.out.println(nood.value);

            showTreeColum(nood.right);
        }
    }

    //поиск минимального елемента
    public Node minValueTree() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.left;
        }
        return last;
    }

    //поиск максимального елемента
    public Node maxValueTree() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.right;
        }
        return last;
    }

    // удаление узла
    public boolean deleteNood(int val) {
        if (root.value == val && root.left == null && root.right == null) {
            System.out.println("ROOT DELETE");
            root = null;
        } else {
            Node current = root;
            Node parent = root;
            boolean isLeftChild = true;
            //поиск узла для удаления
            while (current.value != val) {
                parent = current;
                if (val < current.value) {
                    isLeftChild = true;
                    current = current.left;
                } else {
                    isLeftChild = false;
                    current = current.right;
                }
                if (current == null) {
                    System.out.println("No VALUE");
                    return false;
                }
            }
            if (isLeftChild) {
                parent.left = null;
                System.out.println("DELETE LEFT");
            } else {
                parent.right = null;
                System.out.println("DELETE RIGHT");
            }


            if (current.left==null&&current.right==null){
                if (current==root){
                    root=null;
                }else if (isLeftChild){
                    parent.left=null;
                }else {
                    parent.right=null;
                }
            }else if (current.right==null){
                if (current==root){
                    root=current.left;
                }else if (isLeftChild){
                    parent.left=current.left;
                }else {
                    parent.right=current.left;
                }
            }else if (current.left==null){
                if (current==root){
                    root=current.right;
                }else if (isLeftChild){
                    parent.left=current.right;
                }else {
                    parent.right=current.right;
                }
            }
        }
        return false;
    }
    //вывод дерева
    public void showTree() {
        root.print();
    }


}
