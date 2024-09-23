

package sky.pro.BasketBBB;

import org.springframework.web.bind.annotation.*;
import sky.pro.BasketBBB.Service.BasketService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ControllerBasketController {
    private final BasketService basketService;

    public ControllerBasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void addItems(ArrayList<Integer> items) {
        System.out.println(items);
        basketService.addItems(items);

    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return basketService.getItems();
    }


}