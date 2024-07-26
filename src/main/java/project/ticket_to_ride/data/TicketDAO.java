package project.ticket_to_ride.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.ticket_to_ride.service.TicketService;

/**
 * The DAO that is used in one of the methods in TicketService class.
 * @see TicketService#getAllInfo(String departure, String arrival)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDAO {

    private int segments;

    private int price;

    private String currency;

}
