package hospital.management.system.hms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hospital.management.system.hms.entity.PatientEntity;
import hospital.management.system.hms.repository.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepo patientRepo;
	
	@Override
	public PatientEntity patientregistration(PatientEntity patientEntity) {
		if(patientRepo.existsBypName(patientEntity.getpName())) {
		throw new IllegalArgumentException("Username already Exists!");	
		}
		return patientRepo.save(patientEntity);
	}
	

	

}
