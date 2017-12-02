package com.mateusz.apartmentstore.repositories;

import com.mateusz.apartmentstore.model.Apartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ApartmentRepository extends CrudRepository<Apartment, Long> {




}
