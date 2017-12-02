package com.mateusz.apartmentstore;

import com.mateusz.apartmentstore.model.Apartment;
import com.mateusz.apartmentstore.services.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApartmentBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ApartmentService apartmentService;

    @Autowired
    public void setApartmentService(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadApartments();
    }

    private void loadApartments() {
        Apartment apartment1 = new Apartment("Apartment in Champa Oasis", 700.0);
        Apartment apartment2 = new Apartment("Apartment in Champa 2/4 street", 600.0);
        Apartment apartment3 = new Apartment("Apartment in Maple", 400.0);
        Apartment apartment4 = new Apartment("Apartment in ct1", 700.0);
        Apartment apartment5 = new Apartment("Apartment in vien trieu oceanus", 750.0);
        apartmentService.saveOrUpdate(apartment1);
        apartmentService.saveOrUpdate(apartment2);
        apartmentService.saveOrUpdate(apartment3);
        apartmentService.saveOrUpdate(apartment4);
        apartmentService.saveOrUpdate(apartment5);
    }


}
