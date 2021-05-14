package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketDao implements Dao<Ticket> {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Ticket> ticketRowMapper;

    public TicketDao(JdbcTemplate jdbcTemplate, RowMapper<Ticket> ticketRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.ticketRowMapper = ticketRowMapper;
    }

    @Override
    public Ticket get(Long id) {
        return jdbcTemplate.queryForObject("select * from ticket where id = ?", ticketRowMapper, id);
    }

    @Override
    public List<Ticket> getAll() {
        return jdbcTemplate.query("select t.id, t.date, t.description, t.id_learner, l.lastname, l.firstname, open from ticket t\n" +
                "inner join learner l on l.id_learner = t.id_learner\n" +
                "WHERE open = true\n" +
                "ORDER BY id ASC", ticketRowMapper);
    }

    @Override
    public void save(Ticket ticket) {
        // Insertion du ticket en base
        String sql = "INSERT INTO ticket (description, id_learner) values (?, ?)";
        jdbcTemplate.update(sql, ticket.getDescription(), ticket.getIdLearner());
    }

    @Override
    public void delete(Long id) {
        // Suppression du dernier ticket
        String sql = "UPDATE ticket SET open = 'false' WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

}
