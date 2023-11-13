package SimpleObserve;

public class SimpleObserverImpl implements Observer{
    private int value;
    private Subject subject;

    SimpleObserverImpl(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }


    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    void display() {
        System.out.println("Current value->"+value);
    }
}
