package edu.icet.service;

import edu.icet.dto.Medicine;

import java.util.List;

public interface MedicineService {
    void addMedicine(Medicine medicine);

    Boolean deleteById(Integer id);
    List<Medicine> getAll();

    Medicine getMedicineById(Integer id);
    List<Medicine> getMedicineByMedicineId(Integer id);
    List<Medicine> getMedicineByName(String name);
    List<Medicine> getMedicineByCustomerId(Integer id);
}
