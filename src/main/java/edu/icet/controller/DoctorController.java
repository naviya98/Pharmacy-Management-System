package edu.icet.controller;

import edu.icet.dto.Doctor;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/doctor")

public class DoctorController {
    final DoctorService service;

    @GetMapping("/get-all")
    public List<Doctor> getDoctor() {
        return service.getDoctor();
    }

    @PostMapping("/add-doctor")
    @ResponseStatus(HttpStatus.CREATED)
    public void addDoctor(@RequestBody Doctor doctor) {
        service.addDoctor(doctor);
    }

    @DeleteMapping("delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Doctor> searchByName(@PathVariable String name) {
        return service.searchByName(name);
    }

    @GetMapping("/search-by-specialization/{specialization}")
    public List<Doctor> searchByAddress(@PathVariable String specialization) {
        return service.searchBySpecialization(specialization);
    }
}
