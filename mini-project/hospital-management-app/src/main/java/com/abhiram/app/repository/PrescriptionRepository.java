package com.abhiram.app.repository;

import com.abhiram.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrescriptionRepository extends MongoRepository<Prescription,String> {
    public List<Prescription> findByPatientName(String patientName);
    public Prescription save(Prescription prescription);

}
