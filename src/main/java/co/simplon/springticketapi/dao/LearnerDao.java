package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Learner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LearnerDao implements Dao<Learner> {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Learner> learnerRowMapper;

    public LearnerDao(JdbcTemplate jdbcTemplate, RowMapper<Learner> learnerRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.learnerRowMapper = learnerRowMapper;
    }

    @Override
    public Learner get(Long id) {
        //return jdbcTemplate.query("select * from learner WHERE id_learner = ?", learnerRowMapper, id);
        return null;
    }

    @Override
    public List<Learner> getAll() {
        return jdbcTemplate.query("select * from learner", learnerRowMapper);
    }

    @Override
    public void save(Learner learner) {
        String sql = "INSERT INTO learner (firstname, lastname) values ('"+ learner.getFirstname() + "','"+ learner.getLastname() +"')";
        jdbcTemplate.execute(sql);
    }

    @Override
    public void delete(Long id) {
        // A vous de jouer
    }
}
