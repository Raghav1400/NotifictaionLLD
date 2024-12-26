import observables.ProductObservable;
import observables.impl.ProductObservableImpl;
import observors.CustomerObserver;
import observors.impl.CustomerObserverImpl;
import services.CustomerService;
import services.ProductService;

public class Main {
    public static void main(String[] args) {

        CustomerObserver customerObserver = new CustomerObserverImpl();
        ProductObservable productObservable = new ProductObservableImpl(customerObserver);

        // adding observable of users
        CustomerService customerService = new CustomerService(productObservable);
        customerService.addObservable("Raghav", "Iphone");
        customerService.addObservable("Purav", "Iphone");

        // making product in stock that will notify all its observer
        ProductService productService = new ProductService(productObservable);
        productService.makeAvailable("Iphone");
    }
}