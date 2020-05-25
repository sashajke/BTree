public class main
{
    public static void main(String[] args) {
        BTree<Integer> bTree = new BTree<>(2);
        bTree.insert(5);
        System.out.println(bTree);
        bTree.insert(3);
        System.out.println(bTree);

        bTree.insert(4);
        System.out.println(bTree);

        bTree.insert(6);
        System.out.println(bTree);

        bTree.insert(7);
        System.out.println(bTree);

        bTree.insert(2);
        System.out.println(bTree);

        bTree.insert(1);
        System.out.println(bTree);

        bTree.insert(10);
        System.out.println(bTree);

        bTree.insert(11);
        System.out.println(bTree);
//        bTree.add(7);
//        bTree.add(8);




    }
}
