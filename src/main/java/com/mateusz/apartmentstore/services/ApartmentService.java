package com.mateusz.apartmentstore.services;

import com.mateusz.apartmentstore.model.Apartment;

import java.util.List;

public interface ApartmentService {

    public List<Apartment> listAllApartments();
    public Apartment getApartmentById(Long id);
    public Apartment saveOrUpdate(Apartment apartment);

}
