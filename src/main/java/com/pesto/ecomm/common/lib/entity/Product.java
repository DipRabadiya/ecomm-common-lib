package com.pesto.ecomm.common.lib.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Version;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @Column(name = "product_id", columnDefinition = "uniqueidentifier")
    private volatile String productId = String.valueOf(UUID.randomUUID());

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "entity_version")
    @Version
    private Long entityVersion;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.DETACH, CascadeType.MERGE,  CascadeType.PERSIST}, fetch = FetchType.EAGER)
    private List<Offer> offers;
}
