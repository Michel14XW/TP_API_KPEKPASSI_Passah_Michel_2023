package ucao.api.Ega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ucao.api.Ega.entity.Compte;
import ucao.api.Ega.service.CompteService;

import java.util.List;

@RestController
public class CompteController {
    @Autowired
    private CompteService compteService;
    @GetMapping("/comptes")
    public List<Compte> listeCompte(){
        return compteService.showCompte();
    }
    @GetMapping("/comptes/{id}")
    public Compte getCompte(@PathVariable Integer id){
        return compteService.getOneCompte(id);
    }
    @PostMapping("/comptes")
    public Compte saveCompte(@RequestBody Compte compte){
        return compteService.saveCompte(compte);
    }
    @PutMapping("/comptes/{id}")
    public Compte updateCompte(@PathVariable Integer id, Compte compte){
        compte.setId(id);
        return compteService.saveCompte(compte);
    }
    @DeleteMapping("/comptes/{id}")
    public void supprimerCompte(@PathVariable Integer id){
        compteService.deleteCompte(id);
    }
}
