package Service;

import Entity.Product;
import Payload.ApiResponse;
import Payload.ProductRequest;

public interface ProductService {

    public ApiResponse addProduct(ProductRequest productRequest);
    public ApiResponse deleteProduct(Long id);
    public ApiResponse updateProduct(Long id,ProductRequest productRequest);
    public Product searcProduct(Long id);
}
