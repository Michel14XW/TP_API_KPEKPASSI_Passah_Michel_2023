package ucao.api.Ega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucao.api.Ega.entity.Compte;


public interface CompteRepository extends JpaRepository<Compte, Integer> {
}
