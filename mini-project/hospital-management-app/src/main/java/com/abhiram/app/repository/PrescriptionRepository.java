package com.abhiram.app.repository;

import com.abhiram.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionRepository extends MongoRepository<Prescription,String> {
    public Prescription findByName(String name);
    public Prescription save(Prescription prescription);
}
