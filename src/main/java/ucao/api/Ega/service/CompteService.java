package ucao.api.Ega.service;

import ucao.api.Ega.entity.Compte;

import java.util.List;

public interface CompteService {
    public List<Compte> showCompte();
    public Compte saveCompte(Compte compte);
    public Compte getOneCompte(Integer id);
    public void deleteCompte(Integer id);
}
