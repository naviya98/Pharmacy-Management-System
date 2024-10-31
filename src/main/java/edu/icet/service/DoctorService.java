package edu.icet.service;

import edu.icet.dto.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getDoctor();
    void addDoctor(Doctor doctor);
    void deleteById(Integer id);
    List<Doctor> searchByName(String name);
    List<Doctor> searchById(Integer id);
    List<Doctor> searchBySpecialization(String specialization);
}
