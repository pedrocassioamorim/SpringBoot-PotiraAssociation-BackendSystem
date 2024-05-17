package com.example.associacao_potira.domain.company.orders;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

@Data
@Entity @EqualsAndHashCode
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    private List<OrderItem> items;

    public BigDecimal totalOrder(){
        BigDecimal total = BigDecimal.ZERO;
        Long count1 = 0L;
        for (OrderItem item : items){
            BigDecimal count = item.getPrice();
            count1 += Long.valueOf(String.valueOf(count));
        }
        total.plus();
        return total;
    }

}
