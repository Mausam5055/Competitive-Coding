package greedy_algos;

import java.util.*;

/**
 * Huffman Coding
 * A lossless data compression algorithm. 
 * Assigns variable-length codes to input characters, with shorter 
 * codes assigned to more frequent characters.
 */
public class HuffmanCoding {

    static class Node implements Comparable<Node> {
        char ch;
        int freq;
        Node left = null, right = null;

        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        Node(char ch, int freq, Node left, Node right) {
            this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Node other) {
            return this.freq - other.freq;
        }
    }

    public static void buildHuffmanTree(String text) {
        if (text == null || text.length() == 0) return;

        // Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Priority queue to store live nodes of the Huffman tree
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (var entry : freqMap.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Repeatedly extract two lowest frequency nodes from PQ
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            int sum = left.freq + right.freq;
            pq.add(new Node('\0', sum, left, right));
        }

        // The root of the Huffman tree
        Node root = pq.peek();

        // Print Huffman codes
        Map<Character, String> huffmanCode = new HashMap<>();
        encode(root, "", huffmanCode);

        System.out.println("Huffman Codes:");
        for (var entry : huffmanCode.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nOriginal text: " + text);
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(huffmanCode.get(c));
        }
        System.out.println("Encoded text: " + sb.toString());
    }

    private static void encode(Node root, String str, Map<Character, String> huffmanCode) {
        if (root == null) return;

        // If it's a leaf node, it contains a character
        if (root.left == null && root.right == null) {
            huffmanCode.put(root.ch, str);
        }

        encode(root.left, str + "0", huffmanCode);
        encode(root.right, str + "1", huffmanCode);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to encode: ");
        String text = sc.nextLine();

        buildHuffmanTree(text);
        sc.close();
    }
}
