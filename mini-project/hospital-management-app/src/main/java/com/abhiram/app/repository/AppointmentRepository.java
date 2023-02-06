package com.abhiram.app.repository;

import com.abhiram.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,String> {
    public Appointment findByName(String name);
    public Appointment save(Appointment appointment);
}
