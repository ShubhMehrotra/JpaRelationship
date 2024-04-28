package Service;

import Entity.Address;
import Entity.User;
import Payload.ApiResponse;
import Payload.UserRequest;

public interface UserService {

    public ApiResponse addUser(UserRequest userRequest);
    public ApiResponse deleteUserById(Long id);
    public ApiResponse updateUser(Long id, UserRequest userRequest);
    public User getUserById(Long id);

}
