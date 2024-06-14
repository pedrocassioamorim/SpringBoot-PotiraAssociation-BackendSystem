package com.example.associacao_potira.domain.cannabis;

import com.example.associacao_potira.domain.company.data.Product;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "PRODUCT_ID")
public class CannabisProduct extends Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer dosage;

    @ManyToOne @JoinColumn(name = "cannabis_id")
    private CannabisPlant cannabisPlant;

    private Long volume;

    private Long weight;

    @ManyToMany(mappedBy = "products")
    @ToString.Exclude
    private List<CannabisPlant> plants = new ArrayList<>();

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        CannabisProduct that = (CannabisProduct) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }

}
