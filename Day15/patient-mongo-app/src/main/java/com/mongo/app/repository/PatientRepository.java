package com.mongo.app.repository;

import com.mongo.app.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient,String> {
    public Patient findByName(String name);
    public Patient findByPatId(String patId);
    public void deleteByName(String name);
    public Patient save(Patient patient);
}
