package project.ticket_to_ride.data;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The DAO that returns the negative result, that there is lack of money to buy a ticket.
 */

@Data
@AllArgsConstructor
public class NoResultDAO extends ParentResultDAO{

    private String result;

    private long lackOf;

    private String currency;
}
