package com.Projects.AIRBNB.APP.repositories;

import com.Projects.AIRBNB.APP.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
