package chap10;

import java.util.Optional;

public class Person {
    // 人可能有车，也可能没车
    private Optional<Car> car;

    public Optional<Car> getCar(){ return car;}

}
