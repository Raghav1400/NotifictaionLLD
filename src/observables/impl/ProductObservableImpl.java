package observables.impl;

import observables.ProductObservable;
import observors.CustomerObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductObservableImpl implements ProductObservable {
    public Map<String, List<String>> productToCustomer = new HashMap<>();// db --> pid -> lsit<cid>

    public final CustomerObserver customerObserver;

    public ProductObservableImpl(CustomerObserver customerObserver) {
        this.customerObserver = customerObserver;
    }


    @Override
    public void addObserver(String pid, String cid) {
        List<String> existing = productToCustomer.getOrDefault(pid, new ArrayList<>());
        existing.add(cid);
        productToCustomer.put(pid, existing);
    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void changeState() {

    }

    @Override
    public void notifyObservers(String pid) {
        for (String cid : productToCustomer.get(pid)) {
            customerObserver.update(cid, pid);
        }
    }

    ;
}
