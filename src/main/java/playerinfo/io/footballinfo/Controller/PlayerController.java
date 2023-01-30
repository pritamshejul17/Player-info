package playerinfo.io.footballinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import playerinfo.io.footballinfo.Model.Player;
import playerinfo.io.footballinfo.Service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping
    public ResponseEntity<Void> newPlayer(@RequestBody Player player){
        playerService.save(player);
            return new ResponseEntity<>(HttpStatus.CREATED);

    }
    @GetMapping
    public ResponseEntity<List<Player>> findPlayers(){
        List<Player> players = playerService.findAll();
            return new ResponseEntity<>(players,HttpStatus.OK);
    }

    @GetMapping ("/teammates/{clubName}")
    public ResponseEntity<List<Player>> findPlayersFromClub(@PathVariable String clubName){
        List<Player> players = playerService.findByClub(clubName);
        return new ResponseEntity<>(players,HttpStatus.OK);
    }

}
