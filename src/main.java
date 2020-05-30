public class main
{
    public static void main(String[] args) {
        BTree<Integer> generatedTree = new BTree<Integer>(2);
        generatedTree.insert2pass(38);
        generatedTree.insert2pass(13);
        generatedTree.insert2pass(40);
        generatedTree.insert2pass(54);
        generatedTree.insert2pass(14);
        generatedTree.insert2pass(42);
        generatedTree.insert2pass(43);
        generatedTree.insert2pass(92);
        generatedTree.insert2pass(88);
        generatedTree.insert2pass(64);
        generatedTree.insert2pass(79);
        generatedTree.insert2pass(93);
        generatedTree.insert2pass(80);
        generatedTree.insert2pass(89);
        generatedTree.insert2pass(46);
        generatedTree.insert2pass(37);
        generatedTree.insert2pass(99);
        generatedTree.insert2pass(69);
        generatedTree.insert2pass(22);
        generatedTree.insert2pass(95);
        System.out.println(generatedTree);

        generatedTree.delete(13);
        System.out.println(generatedTree);
        generatedTree.delete(88);
        System.out.println(generatedTree);

        generatedTree.delete(38);
        System.out.println(generatedTree);


        System.out.println(generatedTree);



//        bTree.add(7);
//        bTree.add(8);
    }
}
