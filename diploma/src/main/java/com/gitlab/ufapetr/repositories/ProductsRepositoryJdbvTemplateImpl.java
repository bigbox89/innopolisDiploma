/*

package com.gitlab.ufapetr.repositories;

import com.gitlab.ufapetr.models.Order;
import com.gitlab.ufapetr.models.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;
@Component
public class ProductsRepositoryJdbvTemplateImpl implements ProductsRepository {
    //language=SQL
    private static final String SQL_INSERT = "insert into product(description, price, quantity) values(?,?,?)";

    //language=SQL
    private static final String SQL_SELECT_ALL = "select * from product order by id";

    //language=SQL
    private static final String FIND_ALL_BY_PRICE = "select * from product where product.price > ?";

    //language=SQL
    private static final String FIND_ALL_BY_ORDERS_COUNT = "select * from orders inner join product on product.id = orders.product_id  where orders.product_id = product.id AND orders.quantity = ? ";

    private JdbcTemplate jdbcTemplate;

    public ProductsRepositoryJdbvTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final RowMapper<Product> productRowMapper = (row, rowNumber) -> {
        int id = row.getInt("id");
        String Description = row.getString("description");
        Double Price = row.getDouble("price");
        int Quantity = row.getInt("quantity");
        return new Product(id, Description, Price, Quantity);
    };

    private static final RowMapper<Order> orderRowMapper = (row, rowNumber) -> {
        int product_id = row.getInt("product_id");
        int customer_id = row.getInt("customer_id");

        int Quantity = row.getInt("quantity");
        return new Order(product_id, customer_id, Quantity);
    };


    private static final RowMapper<Order> orderByCountRowMapper = (row, rowNumber) -> {
        int quantity = row.getInt("quantity");
        double price = row.getDouble("price");
        String description = row.getString("description");

        return new Order(quantity, description, price);
    };

    @Override
    public List<Product> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, productRowMapper);
    }

    @Override
    public List<Product> findAllByPrice(double price) {
        return jdbcTemplate.query(FIND_ALL_BY_PRICE, new Object[]{price}, new int[]{Types.REAL}, productRowMapper);
    }

    @Override
    public List<Order> findAllByOrdersCount(int ordersCount) {
        return jdbcTemplate.query(FIND_ALL_BY_ORDERS_COUNT, new Object[]{ordersCount}, new int[]{Types.INTEGER}, orderByCountRowMapper);

    }

    @Override
    public void save(Product product) {
        jdbcTemplate.update(SQL_INSERT, product.getDescription(), product.getPrice(), product.getQuantity());
    }
}

*/
