package com.alperbekar.data.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data

@Entity
@Table(name = "category")
public class CategoryEntity implements Serializable {
    public static final Long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id",unique = true,nullable = false)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    // Relation

    @OneToMany(mappedBy = "categoryEntity",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<BlogEntity> blogEntityList;

    // Parametresiz Constructor
    public CategoryEntity() {
    }

    // Parametreli Constructor
    public CategoryEntity(String categoryName, Date createdDate) {
        this.categoryName = categoryName;
        this.createdDate = createdDate;
    }
}
