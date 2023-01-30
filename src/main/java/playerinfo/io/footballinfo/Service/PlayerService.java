package playerinfo.io.footballinfo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import playerinfo.io.footballinfo.Model.Player;
import playerinfo.io.footballinfo.Respository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public void save(Player player){
        playerRepository.save(player);
    }
    public List<Player> findAll(){
        return playerRepository.findAll().stream().toList();
    }

    public List<Player> findByClub(String clubName){
        return playerRepository.findByClub(clubName);
    }

}
