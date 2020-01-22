public class Petal {
    private int numberOfPetals;

    public Petal() {
    }

    public Petal(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public void bloom(int petals) {
        if (petals > 0&&(petals < 50)) {
              System.out.println("Rose is blooming.");
        } else {
            System.out.println("Not blooming yet");
        }
    }

    public void wilt(int petals){
        while(petals>0){
            petals--;
            System.out.println("Petals left until rose dead!: "+petals);
        }
        System.out.println("Rose is dead!");
    }

    public void printQuantityOfPetals(){

        System.out.println(numberOfPetals);
    }



    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Petal petal = (Petal) o;

        return numberOfPetals == petal.numberOfPetals;

    }

    @Override
    public int hashCode() {
        return numberOfPetals;
    }

    @Override
    public String toString() {
        return "Petal{" +
                "numberOfPetals=" + numberOfPetals +
                '}';
    }
}
