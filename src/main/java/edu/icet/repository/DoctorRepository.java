package edu.icet.repository;

import edu.icet.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<DoctorEntity,Integer> {
    List<DoctorEntity> findByDoctorId(Integer id);
    List<DoctorEntity> findByName(String name);
    List<DoctorEntity> findBySpecialization(String specialization);
}
