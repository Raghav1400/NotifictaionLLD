package services;

import observables.ProductObservable;


public class CustomerService {
    public final ProductObservable productObservable;

    public CustomerService(ProductObservable productObservable) {
        this.productObservable = productObservable;
    }

    public void addObservable(String cid, String pid) {
        productObservable.addObserver(pid, cid);
    }
}
