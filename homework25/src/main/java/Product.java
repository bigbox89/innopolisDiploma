import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    private int id;
    private String description;
    private double price;
    private int quantity;
}
