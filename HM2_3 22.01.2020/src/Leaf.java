public class Leaf {
    private int numberOfLeaf;
    private String leafColor;
    private int temp;

  //  bloom()
 //   makeLeafsYellow()
  //  makeLeafsFall()

    public Leaf() {
    }

    public Leaf(int numberOfLeaf, String leafColor, int leafFall) {
        this.numberOfLeaf = numberOfLeaf;
        this.leafColor = leafColor;
        this.temp = temp;
    }

    public int getNumberOfLeaf() {
        return numberOfLeaf;
    }

    public void setNumberOfLeaf(int numberOfLeaf) {
        this.numberOfLeaf = numberOfLeaf;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public int getLeafFall() {
        return temp;
    }

    public void setLeafFall(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "numberOfLeaf=" + numberOfLeaf +
                ", leafColor='" + leafColor + '\'' +
                ", temp=" + temp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Leaf leaf = (Leaf) o;

        if (numberOfLeaf != leaf.numberOfLeaf) return false;
        if (temp != leaf.temp) return false;
        return leafColor != null ? leafColor.equals(leaf.leafColor) : leaf.leafColor == null;

    }

    @Override
    public int hashCode() {
        int result = numberOfLeaf;
        result = 31 * result + (leafColor != null ? leafColor.hashCode() : 0);
        result = 31 * result + temp;
        return result;
    }

    public void bloom(int leafs) {
        if (leafs > 0) {
            System.out.println("Tree is blooming");
        } else {
            System.out.println("Not blooming yet");
        }
         }

    public void makeLeafsYellow(String color){
        if(color.equals("yellow")){
            System.out.println("Leafs are yellow now!");
        }
        else{
            System.out.println("Not yellow yet");
        }
    }

    public void makeLeafsFall(int temp){
        System.out.println("Temperature now: " + temp);
        System.out.println("Here is the number of leafs now: " + numberOfLeaf);
        if(temp>0 && temp <20) {
            while (numberOfLeaf > 0) {
                numberOfLeaf--;
                System.out.println("leaf remains: " + numberOfLeaf);

            }}
                else {
                System.out.println("Its summer");
                }
        }


        }



