package fa.appcode.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fa.appcode.common.utility.UserPrincipal;
import fa.appcode.model.Users;
import fa.appcode.repository.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService {
	@Autowired
	private UserRepository userRepo;
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users user=userRepo.findUsersByUserName(username);
		if(user==null) {
			throw new UsernameNotFoundException("User 404");
		}
		return new UserPrincipal(user);
	}

}
