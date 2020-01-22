public  class House {
    public static void main(String[] args) {


    WindowAndDoor myHouse=new WindowAndDoor();

    myHouse.setDoor("mainDoor");
    myHouse.setWindow("bigWindow");
    myHouse.setNumberOfDoors(1);
    myHouse.setNumberOfWindows(3);

    myHouse.printQuantityOfDoors();
    myHouse.printQuantityOfWindows();
    myHouse.lockTheHouseByKey("mainDoor","bigWindow");

}
}

