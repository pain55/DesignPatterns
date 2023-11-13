package SimpleObserve;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubjectImpl implements Subject{

    List<Observer> observerList = new ArrayList<>();
    private int value=10;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observerList)
            o.update(this.value);
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
