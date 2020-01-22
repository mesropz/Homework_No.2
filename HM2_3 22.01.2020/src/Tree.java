public class Tree {
    public static void main(String[] args) {

        Leaf myTree=new Leaf();

        myTree.setNumberOfLeaf(5);
        myTree.setLeafColor("yellow");
        myTree.setLeafFall(15);

        myTree.bloom(myTree.getNumberOfLeaf());
        myTree.makeLeafsYellow(myTree.getLeafColor());
        myTree.makeLeafsFall(myTree.getLeafFall());
    }
}
