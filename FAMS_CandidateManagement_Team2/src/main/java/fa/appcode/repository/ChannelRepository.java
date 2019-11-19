package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Channel;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, String>{

}
