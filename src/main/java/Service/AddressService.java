package Service;
import Entity.Address;
import Payload.AddressRequest;
import Payload.ApiResponse;

import java.util.List;

public interface AddressService  {
    public ApiResponse addAddress(AddressRequest addressRequest);
    public ApiResponse deleteAddressById(Long id);
    public ApiResponse updateAddress(Long id,AddressRequest addressRequest);
    public Address getAddressById(Long id);

}