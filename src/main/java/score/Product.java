package score;


import lombok.Data;

import java.math.BigDecimal;
@Data
public class Product {
    private Integer id;
    private String title;
    private BigDecimal cost;

    public Product(int id, String title, BigDecimal cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("id = %-2s | title = %-15s | cost = %-8s" , id, title, cost);
    }
}
