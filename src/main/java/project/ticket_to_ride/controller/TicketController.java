package project.ticket_to_ride.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.ticket_to_ride.data.ParentResultDAO;
import project.ticket_to_ride.data.TicketDAO;
import project.ticket_to_ride.entity.Ticket;
import project.ticket_to_ride.service.TicketService;

@RestController
public class TicketController {

    TicketService ticketService;
    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/ticket/price")
    public TicketDAO getTicketPrice(@RequestParam String departure, @RequestParam String arrival) {
        return ticketService.getAllInfo(departure, arrival);
    }

    @PostMapping("/tickets/")
    public ParentResultDAO saveTicket(@RequestBody Ticket ticket) {
        return ticketService.saveTicket(ticket);
    }
}
