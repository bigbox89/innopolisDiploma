/*
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
    //language=SQL
    private static final String SQL_DELETE_BY_ID ="delete from customer where id = ?";
    //language=SQL
    private static final String SQL_SELECT_BY_ID = "select * from customer where id = ?";
    //language=SQL
    private static final String SQL_UPDATE_BY_ID = "update customer set name = ? where id = ?";;


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

    @Override
    public void delete(Integer customerId) {
        jdbcTemplate.update(SQL_DELETE_BY_ID, customerId);
    }

    @Override
    public Customer findById(Integer customer_id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, userRowMapper, customer_id);
    }

}

*/
