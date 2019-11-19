package fa.appcode.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.UserRole;
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, String>{

}
