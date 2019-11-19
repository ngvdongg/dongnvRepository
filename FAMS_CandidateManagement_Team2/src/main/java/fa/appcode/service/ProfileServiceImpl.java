package fa.appcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.appcode.model.CandidateProfile;
import fa.appcode.model.Profile;
import fa.appcode.repository.ProfileRepository;
@Service
public class ProfileServiceImpl implements ProfileService{
	@Autowired
	private ProfileRepository profileRepository;
	@Override
	public Profile findByCandidateProfil(CandidateProfile candidateProfile) {
		return profileRepository.findByCandidateProfile(candidateProfile);
	}

}
