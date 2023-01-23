package com.raph.demospring.services;



import com.raph.demospring.entities.Doctor;
import com.raph.demospring.entities.Patient;
import com.raph.demospring.repo.DoctorRepository;
import com.raph.demospring.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DoctorPatientService {

    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    PatientRepository patientRepository;

    public DoctorPatientService(){

    }

    public Doctor addDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    
    public Patient addPatient(Patient patient){
        return patientRepository.save(patient);
    }
}
