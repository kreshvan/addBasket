


package sky.pro.BasketBBB;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component//по факту как сервис. только с базой данных(товары)
public class Basket {
    private final List<Integer> repository = new ArrayList<>();

    public void addItems(List<Integer> items) {//добавили пачку в скобках
        repository.addAll(items);

    }

    public List<Integer> getItems() {//забрали пачку из скобок
        return Collections.unmodifiableList(repository);
    }
}

