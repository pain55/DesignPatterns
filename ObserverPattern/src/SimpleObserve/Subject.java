package SimpleObserve;

public interface Subject {
//    subject or observable both are mean same.
//    which emits values.

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

    void setValue(int i);
}
