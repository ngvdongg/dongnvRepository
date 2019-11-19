package fa.appcode.service;

import fa.appcode.model.CandidateProfile;
import fa.appcode.model.Profile;

public interface ProfileService {

	Profile findByCandidateProfil(CandidateProfile candidateProfile);
}
