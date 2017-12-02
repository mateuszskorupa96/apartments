package com.mateusz.apartmentstore.serviceimpl;

import com.mateusz.apartmentstore.model.Apartment;
import com.mateusz.apartmentstore.repositories.ApartmentRepository;
import com.mateusz.apartmentstore.services.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApartmentServiceImpl implements ApartmentService {


    private ApartmentRepository apartmentRepository;

    @Autowired
    public void setApartmentRepository(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    @Override
    public List<Apartment> listAllApartments() {
        List<Apartment> apartments = new ArrayList<>();

        apartmentRepository.findAll().forEach(apartments::add);

        return apartments;
    }

    @Override
    public Apartment getApartmentById(Long id) {
        return apartmentRepository.findOne(id);
    }

    @Override
    public Apartment saveOrUpdate(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }
}
