package com.example.associacao_potira.domain.cannabis;

import com.example.associacao_potira.domain.cannabis.seed.Clone;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CannabisHarvest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cannabis_id", nullable = false)
    private CannabisPlant cannabisPlant;

    @Column(name = "clones", nullable = false)
    private Integer numberOfClones;

    @Column(nullable = false)
    private Instant begin = Instant.now();

    @ManyToMany
    @JoinTable( name = "harvest_clones",
            joinColumns = @JoinColumn(name = "harvest_id"),
            inverseJoinColumns = @JoinColumn(name = "clones_id"))
    @ToString.Exclude
    private List<Clone> clones;


    public Duration getDuration(){
        Long days = cannabisPlant.getLifeCycleInWeeks();
        Instant endOfLife = begin.plus(Duration.ofDays(days));
        Duration quantoFalta = Duration.between(Instant.now(), endOfLife);
        return quantoFalta.abs();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        CannabisHarvest harvest = (CannabisHarvest) o;
        return getId() != null && Objects.equals(getId(), harvest.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
