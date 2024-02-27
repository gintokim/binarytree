// Класс, представляющий узел бинарного дерева
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

// Класс, реализующий бинарное дерево
public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Метод для вставки нового элемента в бинарное дерево
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Метод для выполнения обхода дерева в порядке "вверх-вниз" (in-order)
    public void inOrderTraversal() {
        inOrderTraversalRec(root);
        System.out.println();
    }

    private void inOrderTraversalRec(TreeNode root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRec(root.right);
        }
    }

    // Метод для выполнения обхода дерева в порядке "вниз-вверх" (post-order)
    public void postOrderTraversal() {
        postOrderTraversalRec(root);
        System.out.println();
    }

    private void postOrderTraversalRec(TreeNode root) {
        if (root != null) {
            postOrderTraversalRec(root.left);
            postOrderTraversalRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Метод для выполнения обхода дерева в порядке "вверх-вниз" (pre-order)
    public void preOrderTraversal() {
        preOrderTraversalRec(root);
        System.out.println();
    }

    private void preOrderTraversalRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversalRec(root.left);
            preOrderTraversalRec(root.right);
        }
    }
}