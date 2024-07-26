package project.ticket_to_ride.data;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * The DAO that returns the positive result, that there is enough money to buy a ticket.
 */
@Data
@AllArgsConstructor
public class ResultDAO extends ParentResultDAO{

    private String result;

    private long change;

    private String currency;

}
