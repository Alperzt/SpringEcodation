package com.alperbekar.data.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data

@Entity
@Table(name = "blog")
// Blog(1) Category(N)
public class BlogEntity implements Serializable {
    public static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id",nullable = false,unique = true)
    private Long id;

    @Column(length = 200)
    private String header;

    private String content;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    // Relation
    @OneToMany(mappedBy = "blogEntity",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<CategoryEntity> categoryEntityList;

    // Parametresiz Constructor
    public BlogEntity() {
    }

    // Parametreli Constructor
    public BlogEntity(String header, String content) {
        this.header = header;
        this.content = content;
    }
}
