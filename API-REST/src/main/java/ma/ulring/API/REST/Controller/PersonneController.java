package ma.ulring.API.REST.Controller;

import ma.ulring.API.REST.Model.Personne;
import ma.ulring.API.REST.Service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personnes")
public class PersonneController {
    @Autowired
    private PersonneService personneService;
    //ajout/creation
    @PostMapping()
    public ResponseEntity<Personne> ajouterPersonne(@RequestBody Personne personne) {
        return new ResponseEntity<Personne>(personneService.createPersonne(personne), HttpStatus.CREATED);

    }
    @GetMapping()
    public List<Personne> listerPersonnes() {
        return personneService.getAllPersonnes();
    }
//lister
    @GetMapping("{id}")
    public ResponseEntity<Personne> getPersonneById(@PathVariable("id") long personneId) {
        return new ResponseEntity<Personne>(personneService.getPersonneById(personneId), HttpStatus.OK);
    }

    //suppression
    @DeleteMapping("{id}")
    public ResponseEntity<String> supprimerPersonne(@PathVariable("id") long personneId){
        personneService.deletePersonne(personneId);
        return new ResponseEntity<String>("Personne supprimée avec succes!.", HttpStatus.OK);
    }
    //modifier
    @PutMapping("{id}")
    public ResponseEntity<Personne> modifierPersonne(@PathVariable("id") long personneId, @RequestBody Personne personne){
        return new ResponseEntity<Personne>(personneService.updatePersonne(personneId, personne), HttpStatus.OK);
    }

}
