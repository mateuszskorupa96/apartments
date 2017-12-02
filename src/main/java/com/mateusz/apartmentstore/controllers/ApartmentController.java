package com.mateusz.apartmentstore.controllers;

import com.mateusz.apartmentstore.model.Apartment;
import com.mateusz.apartmentstore.services.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ApartmentController {


    private ApartmentService apartmentService;

    @Autowired
    public void setApartmentService(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @RequestMapping("/apartments")
    public String listAll(Model model) {

        List<Apartment> apartments = apartmentService.listAllApartments();
        model.addAttribute("apartments", apartments);

        return "apartments";
    }

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    @ResponseBody
    public Apartment listAllRest(@RequestParam Long id) {

        List<Apartment> apartments = apartmentService.listAllApartments();
        return apartments.get(id.intValue() - 1);
    }

}
