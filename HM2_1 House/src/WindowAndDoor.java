public class WindowAndDoor {
    private String door;
    private String window;
    private int numberOfDoors;
    private int numberOfWindows;


    public WindowAndDoor(){}

    public WindowAndDoor(String door, String window, int numberOfDoors, int numberOfWindows) {
        this.door = door;
        this.window = window;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
    }
    public void lockTheHouseByKey(String mainDoor, String mainWindow){
        if (mainDoor.equals(getDoor())&&(mainWindow.equals(getWindow()))){
            System.out.printf("House is Locked");
        }
        else {
            System.out.println("Wrong Key!");
        }
    }

    public void printQuantityOfWindows() {
        if (getNumberOfWindows() > 0) {
            System.out.println("Number of windows: "+ getNumberOfWindows());;
        }
        else{
            System.out.println("No Windows");
        }
    }

    public void printQuantityOfDoors(){
        if (getNumberOfDoors()>0){
            System.out.println("Number of doors: "+ getNumberOfDoors());;
        }
        else{
            System.out.println("No doors");
        }

    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public String toString() {
        return "WindowAndDoor{" +
                "door='" + door + '\'' +
                ", window='" + window + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WindowAndDoor that = (WindowAndDoor) o;

        if (numberOfDoors != that.numberOfDoors) return false;
        if (numberOfWindows != that.numberOfWindows) return false;
        if (door != null ? !door.equals(that.door) : that.door != null) return false;
        return window != null ? window.equals(that.window) : that.window == null;

    }

    @Override
    public int hashCode() {
        int result = door != null ? door.hashCode() : 0;
        result = 31 * result + (window != null ? window.hashCode() : 0);
        result = 31 * result + numberOfDoors;
        result = 31 * result + numberOfWindows;
        return result;
    }



}
