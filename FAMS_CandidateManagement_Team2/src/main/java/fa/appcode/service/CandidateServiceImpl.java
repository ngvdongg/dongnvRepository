package fa.appcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.appcode.model.CandidateProfile;
import fa.appcode.repository.CandidateProfileRepository;
import fa.appcode.repository.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService{
	
	@Autowired
	CandidateProfileRepository candidateProfileRepository;
	@Override
	public CandidateProfile findbyId(int id) {
		return candidateProfileRepository.findByCandidateProfileId(id);
	}
	
	
}
