package services;

import observables.ProductObservable;


public class ProductService {
    public ProductObservable productObservable;

    public ProductService(ProductObservable productObservable) {
        this.productObservable = productObservable;
    }

    public void makeAvailable(String pid) {
        productObservable.notifyObservers(pid);
    }
}
