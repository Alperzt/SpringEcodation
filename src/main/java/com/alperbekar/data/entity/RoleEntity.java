package com.alperbekar.data.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

// LOMBOK
@Data

// Entity
@Entity
@Table(name = "role")
// Roles(M) Users(N)
public class RoleEntity implements Serializable {
    public static final Long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id",unique = true,nullable = false)
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    //parametresiz constructor
    public RoleEntity() {}

    //parametreli constructor
    public RoleEntity(String roleName) {
        this.roleName = roleName;
    }

    // RELATION
    @ManyToMany(mappedBy = "roleEntities",fetch = FetchType.LAZY)
    private Collection<UserEntity> userEntities;
} //end class
