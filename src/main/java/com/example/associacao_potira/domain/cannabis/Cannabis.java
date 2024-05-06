package com.example.associacao_potira.domain.cannabis;

import com.example.associacao_potira.domain.cannabis.enums.Specie;
import com.example.associacao_potira.domain.cannabis.enums.Tested;
import com.example.associacao_potira.domain.cannabis.enums.TypeOfPlant;
import com.example.associacao_potira.domain.honey.Honey;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.math.BigDecimal;
import java.util.*;

;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Cannabis {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "image")
    private String imageURL;

    @Enumerated(EnumType.STRING)
    private Specie specie;

    @Enumerated(EnumType.STRING)
    private TypeOfPlant type;

    private BigDecimal level;

    @Column(name = "price_gram")
    private BigDecimal priceG;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private Tested tested;

    @Column(name = "life_in_weeks")
    private Long lifeCycleInWeeks;

    @OneToOne(mappedBy = "cannabis")
    private Honey honey = new Honey();

    @OneToMany
    @ToString.Exclude
    private List<Clone> clones = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "product_plants",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "plant_id")
    )
    @ToString.Exclude
    private Set<CannabisProduct> products= new HashSet<>();

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Cannabis cannabis = (Cannabis) o;
        return getId() != null && Objects.equals(getId(), cannabis.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
