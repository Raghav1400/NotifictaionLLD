package observors.impl;

import lombok.extern.slf4j.Slf4j;
import observors.CustomerObserver;

@Slf4j
public class CustomerObserverImpl implements CustomerObserver {

    @Override
    public void update(String cid, String pid) {
        // send email
        System.out.println("sending notification to customer "+ cid + " for product "+ pid);
    }
}
