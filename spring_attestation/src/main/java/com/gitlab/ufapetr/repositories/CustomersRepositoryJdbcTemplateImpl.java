package com.gitlab.ufapetr.repositories;

import com.gitlab.ufapetr.models.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class CustomersRepositoryJdbcTemplateImpl implements CustomersRepository {

    //language=SQL
    private static final String SQL_INSERT = "insert into customer(name) values(?)";

    //language=SQL
    private static final String SQL_SELECT_ALL = "select * from customer order by id";

    
    private JdbcTemplate jdbcTemplate;

    public CustomersRepositoryJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final RowMapper<Customer> userRowMapper = (row, rowNumber) -> {
        int id = row.getInt("id");
        String Name = row.getString("name");

        return new Customer(id, Name);
    };

    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, userRowMapper);
    }

    @Override
    public void save(Customer customer) {
        jdbcTemplate.update(SQL_INSERT, customer.getName());
    }

}

