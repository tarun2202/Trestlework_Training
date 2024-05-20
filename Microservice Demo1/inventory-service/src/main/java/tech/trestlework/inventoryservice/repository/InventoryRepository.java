package tech.trestlework.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tech.trestlework.inventoryservice.model.Inventory;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

//    Optional findBySkuCode();

    @Query("SELECT i FROM Inventory i WHERE i.skuCode = :skuCode")
    Optional<Inventory> findBySkuCode(@Param("skuCode") String skuCode);
}


