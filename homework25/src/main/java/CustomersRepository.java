import java.util.List;

public interface CustomersRepository {
    List<Customer> findAll();

    void save(Customer customer);
}
