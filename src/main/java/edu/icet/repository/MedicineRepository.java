package edu.icet.repository;

import edu.icet.entity.MedicineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicineRepository extends JpaRepository<MedicineEntity, Integer> {
    List<MedicineEntity> findByMedicineId(Integer id);
    List<MedicineEntity> findByName(String name);
    List<MedicineEntity> findByBatchNumber(String batchNumber);
}
