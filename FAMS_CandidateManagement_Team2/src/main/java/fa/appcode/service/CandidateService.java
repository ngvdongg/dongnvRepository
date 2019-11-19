package fa.appcode.service;

import org.springframework.stereotype.Service;

import fa.appcode.model.CandidateProfile;

@Service
public interface CandidateService {
	public CandidateProfile findbyId(int id);
}
