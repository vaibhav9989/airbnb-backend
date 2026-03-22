package com.Projects.AIRBNB.APP.repositories;
import com.Projects.AIRBNB.APP.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {


}
