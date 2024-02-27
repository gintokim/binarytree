//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainBinaryTree {
    public static void main(String[] args) {
        // Создаем бинарное дерево
        BinaryTree binaryTree = new BinaryTree();

        // Вставляем элементы в дерево
        binaryTree.insert(50);
        binaryTree.insert(30);
        binaryTree.insert(70);
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(60);
        binaryTree.insert(80);

        // Обход дерева в порядке in-order
        System.out.println("In-order traversal:");
        binaryTree.inOrderTraversal();

        // Обход дерева в порядке post-order
        System.out.println("Post-order traversal:");
        binaryTree.postOrderTraversal();

        // Обход дерева в порядке pre-order
        System.out.println("Pre-order traversal:");
        binaryTree.preOrderTraversal();
    }
}