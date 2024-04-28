package Service;

import Entity.Address;
import Entity.User;
import Payload.ApiResponse;
import Payload.UserRequest;
import Repository.UserRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import Exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public ApiResponse addUser(UserRequest userRequest) {
        return Optional.ofNullable(userRequest)
                .map(request->{
                    User user=new User();
                    BeanUtils.copyProperties(userRequest,user);
                    userRepo.save(user);
                    return new ApiResponse(HttpStatus.CREATED,"User created Successfully");
                }).orElse(new ApiResponse(HttpStatus.BAD_REQUEST,"User Failed to get added"));
    }

    @Override
    public ApiResponse deleteUserById(Long id) {
        return userRepo.findById(id)
                .map(user->{
                    userRepo.deleteById(id);
                    return new ApiResponse(HttpStatus.OK,"User deleted Successfully");
                })
                .orElse(new ApiResponse(HttpStatus.NOT_FOUND,"User with this Id not found in the system"));

    }

    @Override
    public ApiResponse updateUser(Long id, UserRequest userRequest) {
        return Optional.ofNullable(userRequest)
                .map(user->{
                    User user1=new User();
                    BeanUtils.copyProperties(userRequest,user1);
                    userRepo.save(user1);
                    return new ApiResponse(HttpStatus.CREATED,"User updated Successfully");
                }).orElse(new ApiResponse(HttpStatus.NOT_FOUND,"User with this Id not found in the system"));
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with id:" + id + "Not exist in the system"));
    }
}
