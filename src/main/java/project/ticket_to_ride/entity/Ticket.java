package project.ticket_to_ride.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name = "departure")
    private String departure;
    @Column(name = "arrival")
    private String arrival;
    @Column(name = "traveller_amount")
    private int travellerAmount;
    @Column(name = "name")
    private String traveller;
    @Column(name = "segments")
    private int segments;
    @Column(name = "price")
    private int price;
    @Column(name = "currency")
    private String currency;

    public Ticket(String departure, String arrival, int travellerAmount,
                  String traveller, int segments, int price, String currency) {
        this.departure = departure;
        this.arrival = arrival;
        this.travellerAmount = travellerAmount;
        this.traveller = traveller;
        this.segments = segments;
        this.price = price;
        this.currency = currency;
    }
}
