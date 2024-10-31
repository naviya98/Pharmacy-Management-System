package edu.icet.service.impl;

import edu.icet.dto.Medicine;
import edu.icet.entity.MedicineEntity;
import edu.icet.repository.MedicineRepository;
import edu.icet.service.MedicineService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class MedicineServiceImpl implements MedicineService {
    final ModelMapper mapper;
    final MedicineRepository repository;

    @Override
    public void addMedicine(Medicine medicine) {
        repository.save(mapper.map(medicine, MedicineEntity.class));
    }

    @Override
    public Boolean deleteById(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Medicine> getAll() {
        List<Medicine> medicines = new ArrayList<>();
        repository.findAll().forEach(entity -> medicines.add(mapper.map(entity, Medicine.class)));
        repository medicine;
    }

    @Override
    public Medicine getMedicineById(Integer id) {
        return null;
    }

    @Override
    public List<Medicine> getMedicineByMedicineId(Integer id) {
        return List.of();
    }

    @Override
    public List<Medicine> getMedicineByName(String name) {
        return List.of();
    }

    @Override
    public List<Medicine> getMedicineByCustomerId(Integer id) {
        return List.of();
    }
}
