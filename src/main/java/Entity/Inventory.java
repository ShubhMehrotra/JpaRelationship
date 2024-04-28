package Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Inventory {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long inventoryId;
    private Long productId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quantity;

}
