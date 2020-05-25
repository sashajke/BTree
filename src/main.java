public class main
{
    public static void main(String[] args) {
        BTree<Integer> bTree = new BTree<>(2);
        bTree.insert(5);
        bTree.insert(3);
        bTree.insert(4);
        bTree.insert(6);
        bTree.add(7);
        bTree.add(8);



        System.out.println(bTree);
    }
}
