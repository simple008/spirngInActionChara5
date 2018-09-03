/*
package spittr.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
import spittr.Spittle;
import sun.security.provider.ConfigFile;

import java.util.List;

@Repository
public class JdbcSpittleRepository implements SpittleRepository {

    private JdbcOperations jdbc;

    @Autowired
    public JdbcSpittleRepository (JdbcOperations jdbc){
        this.jdbc = jdbc;
    }

    public List<Spittle> findSpittles(long max, int count){
        return jdbc.query("select id, message, created_at, latitude, longitude"
        + "from Spittle where id = <? order by created_at desc limit 20",
                new SpittleRowMapper(),max);
    }

    public Spittle findOne(long id){
        return jdbc.queryForObject(
                "select id, message, created_at, latitude, longitude" +
                        " from Spittle" +
                        " where id = ?",
                new SpittleRowMapper(), id);
    }
}
*/
