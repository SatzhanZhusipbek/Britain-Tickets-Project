package project.ticket_to_ride.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInfo {

    private String departure;

    private String arrival;

    private TicketDAO ticketDAO;

}
