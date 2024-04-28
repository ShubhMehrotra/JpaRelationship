package Payload;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class InventoryRequest {

    @NotEmpty(message ="Id cannot be empty")
    private Long productId;
    @NotEmpty(message = "Quantity cannot be empty")
    @Size(min = 1)
    private Long quantity;
}
