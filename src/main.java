public class main
{
    public static void main(String[] args) {
        BTree<Integer> generatedTree = new BTree<Integer>(2);
        generatedTree.insert2pass(5);
        generatedTree.insert2pass(6);
        generatedTree.insert2pass(7);
        generatedTree.insert2pass(8);
        generatedTree.insert2pass(9);
        generatedTree.insert2pass(10);
        generatedTree.insert2pass(11);
        System.out.println(generatedTree);



//        bTree.add(7);
//        bTree.add(8);
    }
}
