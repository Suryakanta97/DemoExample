package com.surya.web.rest;

import com.surya.web.entity.Student;
import com.surya.web.exception.MyResourceNotFoundException;
import com.surya.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDirectoryRestController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/student/get", params = { "page", "size" }, method = RequestMethod.GET, produces = "application/json")
    public Page<Student> findPaginated(@RequestParam("page") int page, @RequestParam("size") int size) {

        Page<Student> resultPage = service.findPaginated(page, size);
        if (page > resultPage.getTotalPages()) {
            throw new MyResourceNotFoundException();
        }
        return resultPage;
    }

}
