

package sky.pro.BasketBBB.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import sky.pro.BasketBBB.Basket;

import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void addItems(List<Integer> items) {
        basket.addItems(items);
    }

    public List<Integer> getItems() {
        return basket.getItems();
    }

}
