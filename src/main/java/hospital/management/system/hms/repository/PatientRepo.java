package hospital.management.system.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hospital.management.system.hms.entity.PatientEntity;

public interface PatientRepo extends JpaRepository<PatientEntity, Integer> {

	boolean existsBypName(String getpName);

}
