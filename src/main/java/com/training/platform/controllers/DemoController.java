package com.training.platform.controllers;

import com.training.platform.services.UserService;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import com.training.platform.entities.User;
import com.training.platform.repositories.UserRepository;

@RestController
public class DemoController {

    // JPA !!!
    /*@Autowired
    private UserService userService;*/


    /*@GetMapping(value = "")
    public String index() {
        List<User> users = userRepository.findAll();
        System.out.println("############### Find All User (In Console) ###############");
        System.out.println(users);
        return "Method GET, Function : index => SHOW data list on page";
    }*/

    // Where condition

//    @GetMapping(value = "")
//    public List<User> index() {
//        List<User> users = userRepository.findByCityAndActiveAndAge("nakornpathom", 1, 18);
//        return users;
//    }
//    /*
//    @GetMapping(value = "")
//    public List<User> index(@RequestParam String city, @RequestParam String active ,@RequestParam String age) {
//        List<User> users = userRepository.findByCityAndActiveAndAge(city, Integer.parseInt(active), Integer.parseInt(age));
//        return users;
//    }
//    */
//
//    /*
//    // Where in
//    @GetMapping(value = "")
//    public List<User> index(){
//        List<Integer> ages = new ArrayList<Integer>(Arrays.asList(18, 19 ,22));
//        List<User> users = userRepository.findByAgeIn(ages);
//        return users;
//    }*/
//
//    // Example for findAllByQuery
//    @GetMapping(value = "/test1")
//    public List<User> test1() {
//        return userRepository.findAllByQuery();
//    }
//    /*
//    // Example for findAllByParamsQuery
//    @GetMapping(value = "/test2")
//    public List<User> test2() {
//        return userRepository.findAllByParamsQuery(0, "nakornpathom");
//    }*/
//
//    // Example for findAllByParamsQuery(RequestParam)
//    @GetMapping(value = "/test2")
//    public List<User> test2(@RequestParam String active, @RequestParam String city) {
//        return userRepository.findAllByParamsQuery(Integer.parseInt(active), city);
//    }
//
//    //เน JPQL!!!
//    // Example for findAllByJpqlQuery
//    @GetMapping(value = "/test3")
//    public List<User> test3() {
//        return userRepository.findAllByJpqlQuery();
//    }
//
//    // Example for findAllByJpqlParamsQuery
//    @GetMapping(value = "/test4")
//    public List<User> test4() {
//        return userRepository.findAllByJpqlParamsQuery(0, "bangkok");
//    }
//
//
//
//    /// Status Request
//    @RequestMapping(value = "/healthcheck")
//    public String healthCheck(HttpServletResponse response) {
//        response.setStatus(HttpServletResponse.SC_OK);
//        return "Hello World!";
//    }
//
//    @GetMapping(value = "/{id}")
//    public String showWithPath(@PathVariable String id) {
//        Optional<User> user = userRepository.findById(Integer.parseInt(id));
//        System.out.println("############### Find User By ID (In Console)(showWithPath) ###############");
//        System.out.println(user);
//
//        return "Method Get, Function : show, ID : "+ id +" => SHOW data by id on page with path";
//    }
//
//    //##RequestParam e.g. ?id=1
//    /*@GetMapping(value = "")
//    public String showWithParam(@RequestParam String id) {
//        return "Method Get, Function : show, ID : "+ id +" => SHOW data by id on page with query string";
//    }*/
//    //Post
//    @PostMapping(value = "")
//    public String create(@RequestBody Map<String,Object> inputs) {
//        System.out.println("########### POST Param ###########");
//        System.out.println(inputs);
//
//        return "Method POST, Function : create => INSERT data to DB";
//    }
//    //{id} is same in the parameter
//    /*@GetMapping(value = "/{id}")
//    public String showWithPath(@PathVariable String id) {
//        return "Method Get, Function : show, ID : "+ id +" => SHOW data by id on page with path";
//    }*/
//
//    @PatchMapping(value = "/{id}")
//    public String update(@PathVariable String id, @RequestParam Map<String,Object> inputs) {
//        System.out.println("########### PATCH Param ###########");
//        System.out.println(inputs);
//
//        return "Method PATCH, Function : update => ID : " + id + " UPDATE data to DB";
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public String destroy(@PathVariable String id)  {
//        return "Method DELETE, Function : delete, ID : " + id + " => DELETE data to DB";
//    }

}
