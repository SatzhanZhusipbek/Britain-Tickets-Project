package project.ticket_to_ride.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticket_to_ride.data.*;
import project.ticket_to_ride.entity.Ticket;
import project.ticket_to_ride.repository.TicketRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    private static List<TicketInfo> possibleTickets;

    private TicketRepository ticketRepository;
    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository=ticketRepository;
    }

    public TicketDAO getAllInfo(String departure, String arrival) {
        fillTickets();
        TicketDAO ticketDAO = new TicketDAO();
        for (TicketInfo possibleTicket : possibleTickets) {
            if (possibleTicket.getDeparture().equalsIgnoreCase(departure)
                    && possibleTicket.getArrival().equalsIgnoreCase(arrival)) {
                ticketDAO = possibleTicket.getTicketDAO();
            }
        }
        return ticketDAO;

    }
    public ParentResultDAO saveTicket(Ticket ticket) {
        ParentResultDAO result = null;
        if (ticket.getTravellerAmount() < ticket.getPrice()) {
            NoResultDAO noResultDAO = new NoResultDAO("failure", (ticket.getPrice()-ticket.getTravellerAmount()),
                    ticket.getCurrency());
            result = noResultDAO;
        }
        else if (ticket.getTravellerAmount() > ticket.getPrice()) {
            ResultDAO resultDAO = new ResultDAO("success", (ticket.getTravellerAmount()-ticket.getPrice()),
            ticket.getCurrency());
            result = resultDAO;
            ticketRepository.save(ticket);
        }
        return result;
    }

    public static void fillTickets() {
        possibleTickets = new ArrayList<>();
        possibleTickets.add(new TicketInfo("Birmingham", "Coventry", new TicketDAO(1, 5,
                "GBP")));
        possibleTickets.add(new TicketInfo("Birmingham", "Bristol", new TicketDAO(3, 10,
                "GBP")));
        possibleTickets.add(new TicketInfo("Birmingham", "Swindon", new TicketDAO(4, 15,
                "GBP")));
        possibleTickets.add(new TicketInfo("Birmingham", "Northhampton", new TicketDAO(3, 10,
                "GBP")));
        possibleTickets.add(new TicketInfo("Birmingham", "London", new TicketDAO(5, 17,
                "GBP")));
        possibleTickets.add(new TicketInfo("Birmingham", "Reading", new TicketDAO(6, 20,
                "GBP")));
        possibleTickets.add(new TicketInfo("Coventry", "Birmingham", new TicketDAO(1, 5,
                "GBP")));
        possibleTickets.add(new TicketInfo("Coventry", "Northhampton", new TicketDAO(2, 7,
                "GBP")));
        possibleTickets.add(new TicketInfo("Coventry", "London", new TicketDAO(4, 15,
                "GBP")));
        possibleTickets.add(new TicketInfo("Coventry", "Bristol", new TicketDAO(4, 15,
                "GBP")));
        possibleTickets.add(new TicketInfo("Coventry", "Reading", new TicketDAO(5, 17,
                "GBP")));
        possibleTickets.add(new TicketInfo("Coventry", "Swindon", new TicketDAO(5, 17,
                "GBP")));
        possibleTickets.add(new TicketInfo("Northhampton", "London", new TicketDAO(2, 7,
                "GBP")));
        possibleTickets.add(new TicketInfo("Northhampton", "Reading", new TicketDAO(3, 10,
                "GBP")));
        possibleTickets.add(new TicketInfo("Northhampton", "Swindon", new TicketDAO(7, 25,
                "GBP")));
        possibleTickets.add(new TicketInfo("Northhampton", "Bristol", new TicketDAO(6, 20,
                "GBP")));
        possibleTickets.add(new TicketInfo("Northhampton", "Birmingham", new TicketDAO(3, 10,
                "GBP")));
        possibleTickets.add(new TicketInfo("Northhampton", "Coventry", new TicketDAO(2, 7,
                "GBP")));
        possibleTickets.add(new TicketInfo("London", "Reading", new TicketDAO(1, 5,
                "GBP")));
        possibleTickets.add(new TicketInfo("London", "Swindon", new TicketDAO(5, 17,
                "GBP")));
        possibleTickets.add(new TicketInfo("London", "Bristol", new TicketDAO(7, 25,
                "GBP")));
        possibleTickets.add(new TicketInfo("London", "Northhampton", new TicketDAO(2, 7,
                "GBP")));
        possibleTickets.add(new TicketInfo("London", "Coventry", new TicketDAO(4, 15,
                "GBP")));
        possibleTickets.add(new TicketInfo("London", "Birmingham", new TicketDAO(5, 17,
                "GBP")));
        possibleTickets.add(new TicketInfo("Reading", "London", new TicketDAO(1, 5,
                "GBP")));
        possibleTickets.add(new TicketInfo("Reading", "Swindon", new TicketDAO(4, 15,
                "GBP")));
        possibleTickets.add(new TicketInfo("Reading", "Bristol", new TicketDAO(6, 20,
                "GBP")));
        possibleTickets.add(new TicketInfo("Reading", "Northhampton", new TicketDAO(3, 10,
                "GBP")));
        possibleTickets.add(new TicketInfo("Reading", "Coventry", new TicketDAO(5, 17,
                "GBP")));
        possibleTickets.add(new TicketInfo("Reading", "Birmingham", new TicketDAO(6, 20,
                "GBP")));
        possibleTickets.add(new TicketInfo("Swindon", "Bristol", new TicketDAO(2, 7,
                "GBP")));
        possibleTickets.add(new TicketInfo("Swindon", "Reading", new TicketDAO(4, 15,
                "GBP")));
        possibleTickets.add(new TicketInfo("Swindon", "London", new TicketDAO(5, 17,
                "GBP")));
        possibleTickets.add(new TicketInfo("Swindon", "Birmingham", new TicketDAO(4, 15,
                "GBP")));
        possibleTickets.add(new TicketInfo("Swindon", "Coventry", new TicketDAO(5, 17,
                "GBP")));
        possibleTickets.add(new TicketInfo("Swindon", "Northhampton", new TicketDAO(7, 25,
                "GBP")));
        possibleTickets.add(new TicketInfo("Bristol", "Swindon", new TicketDAO(2, 7,
                "GBP")));
        possibleTickets.add(new TicketInfo("Bristol", "Birmingham", new TicketDAO(3, 10,
                "GBP")));
        possibleTickets.add(new TicketInfo("Bristol", "Coventry", new TicketDAO(4, 15,
                "GBP")));
        possibleTickets.add(new TicketInfo("Bristol", "Northhampton", new TicketDAO(6, 20,
                "GBP")));
        possibleTickets.add(new TicketInfo("Bristol", "Reading", new TicketDAO(6, 20,
                "GBP")));
        possibleTickets.add(new TicketInfo("Bristol", "London", new TicketDAO(7, 25,
                "GBP")));
    }
}
