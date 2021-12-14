import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    private int id;
    private String name;
}
