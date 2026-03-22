package com.Projects.AIRBNB.APP.dto;

import com.Projects.AIRBNB.APP.entity.Hotel;
import com.Projects.AIRBNB.APP.entity.Inventory;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class RoomDto  {
    private Long id;

    private String type;

    private BigDecimal baseprice;
    private String[] photos;

    private String[] amenities;

    private Integer totalcount;//room count

    private Integer capacity;//person capaacity



}
