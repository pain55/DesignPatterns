package SimpleObserve;

public class SimpleObserverApp {
    public static void main(String[] args) {
        Subject simpleSubject = new SimpleSubjectImpl();

        Observer simpleObserver = new SimpleObserverImpl(simpleSubject);
        Observer simpleObserver2 = new SimpleObserverImpl(simpleSubject);

        simpleSubject.setValue(30);

        simpleSubject.removeObserver(simpleObserver);
        simpleSubject.setValue(99);

    }
}
