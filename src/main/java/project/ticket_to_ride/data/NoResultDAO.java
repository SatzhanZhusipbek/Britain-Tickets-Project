package project.ticket_to_ride.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NoResultDAO extends ParentResultDAO{

    private String result;

    private long lackOf;

    private String currency;
}
