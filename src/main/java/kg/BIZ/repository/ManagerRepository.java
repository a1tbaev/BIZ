package kg.BIZ.repository;

import kg.BIZ.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
    Optional<Manager> findManagerByUserId(Long aLong);
}