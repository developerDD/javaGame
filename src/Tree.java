

public class Tree {
    Node root;

    //добавление в узел
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
    public void showTree(Node nood) {

        if (nood != null) {
            showTree(nood.left);
            System.out.println(nood.value);
            showTree(nood.right);
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
}
