package project.ticket_to_ride.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultDAO extends ParentResultDAO{

    private String result;

    private long change;

    private String currency;

}
