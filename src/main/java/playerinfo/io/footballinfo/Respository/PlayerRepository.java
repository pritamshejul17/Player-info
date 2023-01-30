package playerinfo.io.footballinfo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import playerinfo.io.footballinfo.Model.Player;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long>{
    List<Player> findByClub(String club);
}
