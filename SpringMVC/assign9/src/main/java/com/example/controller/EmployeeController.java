package com.example.controller;

import com.example.Dao.EmployeeDao;
import com.example.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao dao;

    @RequestMapping(value="/viewemp/{pageid}")
    public String edit(@PathVariable int pageid, Model m){
        int total=5;
        if(pageid==1){}
        else{
            pageid=(pageid-1)*total+1;
        }
        System.out.println(pageid);
        List<EmployeeModel> list=dao.getEmployeesByPage(pageid,total);
        m.addAttribute("msg", list);
        return "viewemp";
    }
}