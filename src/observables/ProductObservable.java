package observables;

public interface ProductObservable {
    void addObserver(String pid, String cid);

    void removeObserver();

    void notifyObservers(String pid);

    void changeState();
}
