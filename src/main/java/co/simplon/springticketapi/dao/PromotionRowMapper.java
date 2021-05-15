package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Promotion;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PromotionRowMapper implements RowMapper<Promotion> {

    @Override
    public Promotion mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Promotion(resultSet.getInt("id_promotion"), resultSet.getString("promotion_name"));
    }
}
