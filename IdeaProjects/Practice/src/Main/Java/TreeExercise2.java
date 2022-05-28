package Main.Java;

class Run {
    public static void main(String[] args) {
        // Tree 생성
        TreeExercise2 tree = new TreeExercise2();

        // 노드 생성
        TreeExercise2.Node node0 = tree.addNode(0);
        TreeExercise2.Node node1 = tree.addNode(1);
        TreeExercise2.Node node2 = tree.addNode(2);
        TreeExercise2.Node node3 = tree.addNode(3);
        TreeExercise2.Node node4 = tree.addNode(4);
        TreeExercise2.Node node5 = tree.addNode(5);
        TreeExercise2.Node node6 = tree.addNode(6);

        // 연결 관계 생성
        node0.addLeft(node1);
        node0.addRight(node2);
        node1.addLeft(node3);
        node1.addRight(node4);
        node2.addLeft(node5);
        node2.addRight(node6);

        // 트리 모양:
        //    0
        //  1   2
        // 3 4 5 6

        // 순회
        tree.preOrder(node1);
        System.out.println(); // 1 3 4
        tree.inOrder(node1);
        System.out.println(); // 3 1 4
        tree.postOrder(node1);
        System.out.println(); // 3 4 1

        // 노드 삭제
        node1.deleteLeft();
        node2.deleteRight();

        // 순회
        System.out.println(); // 1 4
        tree.preOrder(node1);
        System.out.println(); // 1 4
        tree.inOrder(node1);
        System.out.println(); // 4 1
        tree.postOrder(node1);
        System.out.println(); // (null)
    }
}
public class TreeExercise2 {
    int count;

    public TreeExercise2() {
        count = 0;
    }
    public class Node {
        Object data;
        Node left;
        Node right;

        public Node(Object data) {
            this.data = data;
            left = null;
            right = null;
        }
        public void addLeft(Node node) {
            left = node;
            count++;
        }
        public void addRight(Node node) {
            right = node;
            count++;
        }
        public void deleteLeft() {
            left = null;
            count--;
        }
        public void deleteRight() {
            right = null;
            count--;
        }
    }
    public Node addNode(Object data) {
        Node n = new Node(data);
        return n;
    }
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Node node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);
    }
    public void postOrder(Node node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data+ " ");
    }

}

