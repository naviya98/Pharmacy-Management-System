package edu.icet.service.impl;

import edu.icet.dto.Doctor;
import edu.icet.entity.DoctorEntity;
import edu.icet.repository.DoctorRepository;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class DoctorServiceImpl implements DoctorService {
    final DoctorRepository repository;
    final ModelMapper mapper;

    @Override
    public List<Doctor> getDoctor() {
        List<Doctor> doctors = new ArrayList<>();
        repository.findAll().forEach(doctor-> doctors.add(mapper.map(doctor, Doctor.class)));
        return doctors;
    }

    @Override
    public void addDoctor(Doctor doctor) {
        repository.save(mapper.map(doctor, DoctorEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
            repository.deleteById(id);
    }

    @Override
    public List<Doctor> searchByName(String name) {
        List<Doctor> doctors = new ArrayList<>();
        repository.findByName(name).forEach(entity ->{
        doctors.add(mapper.map(entity, Doctor.class));
        });
        return doctors;
    }

    @Override
    public List<Doctor> searchById(Integer id) {
            List<Doctor> doctors = new ArrayList<>();
            repository.findById(id).forEach(entity ->{
                doctors.add(mapper.map(entity, Doctor.class));
            });
            return doctors;
    }

    @Override
    public List<Doctor> searchBySpecialization(String specialization) {
            List<Doctor> doctors = new ArrayList<>();
            repository.findBySpecialization(specialization).forEach(entity ->{
                doctors.add(mapper.map(entity, Doctor.class));
            });
    }
}
