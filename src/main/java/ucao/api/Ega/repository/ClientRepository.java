package ucao.api.Ega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucao.api.Ega.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
