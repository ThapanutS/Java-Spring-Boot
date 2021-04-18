package com.training.platform.controllers;

import com.training.platform.entities.User;
import com.training.platform.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/demo")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public List<User> index() { ///test 9
        // Change from UserRepository to UserService
        return userService.findAllByJpqlParamsQuery(0, "bangkok");
    }

    @GetMapping(value = "/findAll")
    public List<User> findAll(HttpServletResponse response){
        response.setStatus(HttpServletResponse.SC_OK);
        return userService.findAll();
    }

    @GetMapping(value = "/findById/{id}")
    public Optional findById(HttpServletResponse response,@PathVariable String id){
        response.setStatus(HttpServletResponse.SC_OK);
        Optional<User> user = userService.findById(Integer.parseInt(id));
        System.out.println(user);
        return user;
    }

    @GetMapping(value = "/findAllByLimit")
    public Page<User> findAllByLimit(@RequestParam String start,@RequestParam String limit ,@RequestParam String field ){
        return userService.findAllByLimit(Integer.parseInt(start),Integer.parseInt(limit),field);
    }

    @GetMapping(value = "/findByAgeIn")
    public List<User> findByAgeIn(@RequestParam(name = "age") List<Integer> age){
        return userService.findByAgeIn(age);
    }

    @GetMapping(value = "/findByCityAndActiveAndAge")
    public List<User> findByCityAndActiveAndAge(@RequestParam String city,@RequestParam Integer active,@RequestParam Integer age){
        return userService.findByCityAndActiveAndAge(city,active,age);
    }

    @GetMapping(value = "/findAllByQuery")
    public List<User> findAllByQuery() {
        return userService.findAllByQuery();
    }

    @GetMapping(value = "/findAllByParamsQuery/")
    public List<User> findAllByParamsQuery(HttpServletResponse response,@RequestParam String active, @RequestParam String city) {
        response.setStatus(HttpServletResponse.SC_FOUND);
        return userService.findAllByParamsQuery(Integer.parseInt(active),city);
    }

    @GetMapping(value = "/findAllByJpqlQuery")
    public List<User> findAllByJpqlQuery() {
        return userService.findAllByJpqlQuery();
    }

    @GetMapping(value = "/findByAgeLessThan/{age}")
    public List<User> findByAgeLessThan(@PathVariable Integer age) {
        return userService.findByAgeLessThan(age);
    }

    @GetMapping(value = "/findByCityEquals")
    public List<User> findByCityEquals(@RequestParam String city) {
        return userService.findByCityEquals(city);
    }

}
