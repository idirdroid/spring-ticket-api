package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Promotion;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PromotionDao implements Dao<Promotion> {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Promotion> PromotionRowMapper;

    public PromotionDao(JdbcTemplate jdbcTemplate, RowMapper<Promotion> promotionRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.PromotionRowMapper = promotionRowMapper;
    }

    @Override
    public Promotion get(Long id) {
        //return jdbcTemplate.query("select * from promotions WHERE id_learner = ?", learnerRowMapper, id);
        return null;
    }

    @Override
    public List<Promotion> getAll() {
        System.out.println("Récupération de la liste des promotions");
        return jdbcTemplate.query("select * from promotions", PromotionRowMapper);
    }

    @Override
    public void save(Promotion promotion) {
        String sql = "INSERT INTO promotions (promotion_name) values (?)";
        jdbcTemplate.update(sql, promotion.getPromotionName());
    }

    @Override
    public void delete(Long id) {
        // Suppression de la promotion
        String sql = "DELETE FROM promotions WHERE id_promotion = ?";
        jdbcTemplate.update(sql, id);
    }
}
