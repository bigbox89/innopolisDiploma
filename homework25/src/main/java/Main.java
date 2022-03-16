import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
/**
*Реализовать ProductsRepository
 *
 * - List<Product> findAll();
 * - List<Product> findAllByPrice(double price);
 * * List<Product> findAllByOrdersCount(int ordersCount); - найти все товары по количеству заказов, в которых участвуют
* */
public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DriverManagerDataSource("jdbc:postgresql://localhost:5432/postgres",
                "postgres", "1");
        CustomersRepository customersRepository = new CustomersRepositoryJdbcTemplateImpl(dataSource);
        ProductsRepository productsRepository = new ProductsRepositoryJdbvTemplateImpl(dataSource);
        //Добавление покупателя в базу
        Customer customer = Customer.builder()
                .name("Александр Пушкин")
                .build();
        customersRepository.save(customer);

        //Добавление товара в базу
      Product product = Product.builder()
                .description("BMW X6")
                .price(1500000.0)
                .quantity(10)
                .build();

        productsRepository.save(product);

        //вывод списка всех покупателей
        System.out.println(customersRepository.findAll());
        //вывод списка всех товаров
        System.out.println(productsRepository.findAll());
        //вывод списка товаров с ценой более 500000
        System.out.println(productsRepository.findAllByPrice(500000.0));
        //вывод списка товаров по количеству заказов
        System.out.println(productsRepository.findAllByOrdersCount(2));
    }
}
