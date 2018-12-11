package lesson5;


public class BST<Key extends Comparable<Key>, Value> {
    private class Node {
        Key key;
        Value value;
        Node left;
        Node right;
        int size; // кол-во узлов в дереве,
        // корнем которого являеся данный узел

        public Node(Key key, Value value, int size) {
            this.key = key;
            this.value = value;
            this.size = size;
        }

    }

    private Node root = null;

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return this.size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.size;
        }
    }

    public Value get(Key key) { //a[key]
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Нет такого ключа");
        }
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node.value;
        } else if (cmp < 0) {
            return get(node.left, key);
        } else {
            return get(node.right, key);
        }
    }

    public boolean contains(Key key) {
        return get(root, key) != null;
    }

    private Node put(Node node, Key key, Value value) {//a[key] = value;
        if (node == null) {
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            node.value = value;
        } else if (cmp < 0) {
            node.left = put(node.left, key, value);
        } else {
            node.right = put(node.right, key, value);
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public void put(Key key, Value value) {
        if (key == null) {
            throw new IllegalArgumentException("недопустимый ключ");
        }
        root = put(root, key, value);
    }

}
