package OptimalStrategyPattern;

public class Squeak implements Quackable{

    //  compared to better approach where we have to custom implementation for each class
//  here we have some class which have most behavior and encapsulate them.
//  so when in future if we want to make changes we can just make it here rather than in each class.
//  thereby our code became flexible and extensible also achieved code reuse.
//  This is known as Strategy Pattern.
    @Override
    public void quack() {
        System.out.println("Squeak!!");
    }
}
