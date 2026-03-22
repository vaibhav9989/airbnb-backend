package com.Projects.AIRBNB.APP.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@Table()
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @Column(nullable = false)//delux, 1 bedroom, etc
    private String type;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal baseprice;
    @Column(columnDefinition = "Text[]")
    private String[] photos;

    @Column(columnDefinition = "Text[]")
    private String[] amenities;

    @Column(nullable = false)
    private Integer totalcount;//room count

    @Column(nullable = false)
    private Integer capacity;//person capaacity


    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(updatable = false)
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "room")
    private Set<Inventory> inventoryList;


}
