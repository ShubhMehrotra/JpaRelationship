package Payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.N;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    @NotEmpty(message = "Product Name cannot be Empty")
    private String productName;
    @NotEmpty(message ="Product Description cannot be Empty")
    private String productDescription;
    @NotEmpty(message = "Product price cannot be empty")
    @Size(min = 1)
    private Long productPrice;

}
