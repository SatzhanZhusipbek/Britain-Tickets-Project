package project.ticket_to_ride.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.ticket_to_ride.entity.Ticket;


@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
