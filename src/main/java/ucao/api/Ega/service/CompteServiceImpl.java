package ucao.api.Ega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucao.api.Ega.entity.Compte;
import ucao.api.Ega.repository.CompteRepository;

import java.util.List;
@Service
public class CompteServiceImpl implements CompteService{
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public List<Compte> showCompte() {
        return compteRepository.findAll();
    }

    @Override
    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public Compte getOneCompte(Integer id) {
        return compteRepository.findById(id).get();
    }

    @Override
    public void deleteCompte(Integer id) {
        compteRepository.deleteById(id);
    }
}
