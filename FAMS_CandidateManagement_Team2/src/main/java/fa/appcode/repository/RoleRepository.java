package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String>{

}
