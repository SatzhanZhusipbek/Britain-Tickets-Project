package project.ticket_to_ride.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.ticket_to_ride.service.TicketService;

/**
 * This class is used in one of the methods in TicketService class.
 * @see TicketService#fillTickets()
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInfo {

    private String departure;

    private String arrival;

    private TicketDAO ticketDAO;

}
