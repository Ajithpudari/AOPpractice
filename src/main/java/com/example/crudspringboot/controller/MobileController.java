package com.example.crudspringboot.controller;

import com.example.crudspringboot.entity.Mobile;
import com.example.crudspringboot.service.IMobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("app/v1")
public class MobileController {

    @Autowired
    IMobileService iMobileService;

    @GetMapping("/test")
    public String getMessage() {
        return "Hello Application";
    }

    @PostMapping("/post")
    public String post(@RequestBody Mobile mobile) {
        iMobileService.post(mobile);
        return "success";
    }

    @GetMapping("/get/{mobileId}")
    public Optional<Mobile> getOne(@PathVariable("mobileId") long mobileId) {
        return iMobileService.getOne(mobileId);
    }

    @GetMapping("/getall")
    public List<Mobile> getAll() {
        return iMobileService.getAll();
    }

    @DeleteMapping("/delete/{mobileId}")
    public String delete(@PathVariable("mobileId") long mobileId) {
        return iMobileService.delete(mobileId);
    }

}
