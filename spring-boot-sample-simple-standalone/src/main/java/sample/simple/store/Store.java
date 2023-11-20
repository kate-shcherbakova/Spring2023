package sample.simple.store;

import sample.simple.bank.IBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.simple.provider.IProvider;

@Component
public class Store implements ILane, IFastLane, IJustHaveALook {

    @Autowired
    IBank iBank;

    @Autowired
    IProvider iProvider;

    @Override
    public void test(String s) {
        System.out.println(s);
    }
}
