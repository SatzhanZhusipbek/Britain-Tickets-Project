package project.ticket_to_ride.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDAO {

    private int segments;

    private int price;

    private String currency;

}
