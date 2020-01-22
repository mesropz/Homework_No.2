public class Rose {
    public static void main(String[] args) {

Petal petal =new Petal();

petal.setNumberOfPetals(16);


petal.bloom(petal.getNumberOfPetals());
petal.wilt(petal.getNumberOfPetals());
petal.printQuantityOfPetals();


}
}
