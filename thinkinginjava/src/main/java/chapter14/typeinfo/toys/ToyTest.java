package chapter14.typeinfo.toys;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    Toy(){}
    Toy(int i){}
}

class FancyToy extends  Toy implements HasBatteries, Waterproof, Shoots{
    FancyToy(){super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc){
        System.out.println();
    }
}
