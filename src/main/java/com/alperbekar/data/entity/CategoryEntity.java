package com.alperbekar.data.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
@Data

@Entity
@Table(name = "category")
public class CategoryEntity {
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
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "blog_id",nullable = false)
    BlogEntity blogEntity;

    // Parametresiz Constructor
    public CategoryEntity() {
    }

    // Parametreli Constructor
    public CategoryEntity(String categoryName, Date createdDate) {
        this.categoryName = categoryName;
        this.createdDate = createdDate;
    }
}
