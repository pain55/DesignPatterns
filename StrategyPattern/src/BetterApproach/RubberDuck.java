package BetterApproach;

public class RubberDuck extends Duck implements Quackable {


//    The above approach works without any flaw.
//    But is it future proof?
//    NO!!, because we are writing custome implementation for each class which implements the interface.
//    for small applications it okay but when in large scale application when we make incremental changes it
//    will become nightmare for developers to code and test.
//    it lost flexibility in the process.

    @Override
    public void quack() {
        System.out.println("Squeak!!");
    }
}
