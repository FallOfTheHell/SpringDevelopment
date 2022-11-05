package score;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {
    private final Map<Integer, Product> productID = new HashMap<>();

    {
        productID.put(1,new Product(1, "Bad", BigDecimal.valueOf(103)));
        productID.put(2,new Product(2, "Milk", BigDecimal.valueOf(603)));
        productID.put(3,new Product(3, "Eggs", BigDecimal.valueOf(91)));
        productID.put(4,new Product(4, "Sausage", BigDecimal.valueOf(181)));
        productID.put(5,new Product(5, "Cheese", BigDecimal.valueOf(278)));
    }

    public List<Product> findAll(){
        return new ArrayList<>(productID.values());
    }

    public void saveOrUpdate(Product product){
        if (product.getId() == null){
            Integer id = productID.size() + 1;
            product.setId(id);
        }
        productID.put(product.getId(), product);
    }

    public Product findById(int id){
        return productID.get(id);
    }

    public Product deleteById(int id){
        return productID.remove(id);
    }
}

