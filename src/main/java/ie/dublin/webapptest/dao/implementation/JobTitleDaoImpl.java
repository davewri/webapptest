package ie.dublin.webapptest.dao.implementation;

import ie.dublin.webapptest.dao.JobTitleDao;
import ie.dublin.webapptest.model.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JobTitleDaoImpl implements JobTitleDao {
    // SQL for selecting job titles
    private final String SELECT_SQL = "SELECT * FROM dbo.JobTitle";
    private final String SELECT_SQL_BY_ID = "SELECT * FROM dbo.JobTitle WHERE titleId = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Implement findAll() which retrieves all job titles from the DB
    // JobTitleMapper() converts rows from the result into Job Title objects
    public List<JobTitle> findAll() {

        // Use jdbcTemplate to execute query
        // Then use JobTitleMapper to crate a job title object for each row in the query result
        return jdbcTemplate.query(SELECT_SQL, new JobTitleMapper());
    }

    // Return a single Job Title matching id
    public JobTitle findById(int id) {
        return jdbcTemplate.queryForObject(SELECT_SQL_BY_ID, new Object[]{id}, new JobTitleMapper());
    }
}

// This class converts resultset rows (from the sql execution) into Java objects
class JobTitleMapper implements RowMapper<JobTitle> {
    @Override
    public JobTitle mapRow(ResultSet rs, int rowNum) throws SQLException {
        JobTitle j = new JobTitle();
        j.setTitleId(rs.getInt("titleId"));
        j.setTitleType(rs.getString("titleType"));
        j.setTitleDescription(rs.getString("titleDescription"));
        return j;
    }
}