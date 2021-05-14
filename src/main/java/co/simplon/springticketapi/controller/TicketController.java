package co.simplon.springticketapi.controller;

import co.simplon.springticketapi.dao.TicketDao;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "*")

public class TicketController {

    private final TicketDao ticketDao;

    public TicketController(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketDao.getAll();
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable Long id) {

        return ticketDao.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void insertTicket(@RequestBody Ticket ticket){
        System.out.println(ticket.toString());
        //Insertion en BDD
        ticketDao.save(ticket);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateTicket(@RequestBody int id){
        System.out.println("Clôture du ticket du ticket n°"+ id);
        //Suppression du dernier ticket en BDD

        ticketDao.delete(Long.valueOf(id));
    }

}
