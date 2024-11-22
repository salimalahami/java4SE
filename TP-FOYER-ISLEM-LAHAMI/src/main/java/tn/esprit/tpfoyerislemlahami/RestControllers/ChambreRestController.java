package tn.esprit.tpfoyerislemlahami.RestControllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyerislemlahami.entities.Chambre;
import tn.esprit.tpfoyerislemlahami.services.IchambreService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chambres")
public class ChambreRestController {

    @Autowired
    private IchambreService chambreService;

    // POST - Add a new Chambre
    @PostMapping
    public ResponseEntity<Chambre> addChambre(@RequestBody Chambre chambre) {
        Chambre savedChambre = chambreService.add(chambre);
        return new ResponseEntity<>(savedChambre, HttpStatus.CREATED);
    }

    // GET - Retrieve all Chambres
    @GetMapping
    public ResponseEntity<List<Chambre>> getAllChambres() {
        List<Chambre> chambres = chambreService.findAll();
        return new ResponseEntity<>(chambres, HttpStatus.OK);
    }

    // GET - Retrieve a Chambre by ID hellllllllllll
    @GetMapping("/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable long id) {
        Optional<Chambre> chambre = Optional.ofNullable(chambreService.findById(id));
        return chambre.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // PUT - Update an existing Chambre
    @PutMapping("/{id}")
    public ResponseEntity<Chambre> updateChambre(@PathVariable long id, @RequestBody Chambre chambre) {
        if (!chambreService.existById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        chambre.setIdChambre(id); // Ensure the ID matches the path variable
        Chambre updatedChambre = chambreService.update(chambre);
        return new ResponseEntity<>(updatedChambre, HttpStatus.OK);
    }

    // DELETE - Delete a Chambre by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable long id) {
        if (!chambreService.existById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        chambreService.deleteChambreById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // DELETE - Delete all Chambres
    @DeleteMapping
    public ResponseEntity<Void> deleteAllChambres() {
        chambreService.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
