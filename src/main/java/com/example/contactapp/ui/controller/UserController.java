package com.example.contactapp.ui.controller;

import com.example.contactapp.service.UserService;
import com.example.contactapp.shared.dto.UserDto;
import com.example.contactapp.ui.model.request.UserDetailsRequestModel;
import com.example.contactapp.ui.model.response.OperationStatusModel;
import com.example.contactapp.ui.model.response.RequestOperationName;
import com.example.contactapp.ui.model.response.RequestOperationStatus;
import com.example.contactapp.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController  //managing CRUD methods. spring MVC controller for managong spring Restful web service requests
@RequestMapping("/users")  //The @RequestMapping annotation is used to map web requests to Spring Controller methods.
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping(path = "/{id}")
    public UserRest getUser( @PathVariable String id){
        UserRest returnValue = new UserRest();
        UserDto userDto = userService.getUserByUserId(id);
        BeanUtils.copyProperties(userDto, returnValue);
        return returnValue;
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){
        UserRest returnValue = new UserRest();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }

    @PutMapping(path = "/{id}")
    public UserRest updateUser(@PathVariable String id, @RequestBody UserDetailsRequestModel user){
        UserRest returnValue = new UserRest();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);

        UserDto updatedUser = userService.updateUser(id,userDto);
        BeanUtils.copyProperties(updatedUser, returnValue);


        return returnValue;
    }

    @DeleteMapping(path = "/{id}")
    public OperationStatusModel deleteuser(@PathVariable String id){
        OperationStatusModel returnValue= new OperationStatusModel();
        userService.deletUser(id);
        returnValue.setOperationName(RequestOperationName.DELETE.name());
        returnValue.setOperationResult(RequestOperationStatus.SUCCESS.name());

        return returnValue;


    }
}
