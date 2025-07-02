package danielerusso.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipations")

public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int partecipation_id;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    private PartecipationType state;
}
