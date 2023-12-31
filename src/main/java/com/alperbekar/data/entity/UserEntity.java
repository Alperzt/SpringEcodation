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
@Table(name = "user")
// Users(N) Roles(M)
public class UserEntity implements Serializable {
    public static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_password")
    private String userPassword;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    //parametresiz constructor
    public UserEntity() {
    }

    //parametreli constructor
    public UserEntity(String userName, String userEmail, String userPassword) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    // RELATION
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
            (
                    joinColumns = @JoinColumn(name = "user_id"),
                    inverseJoinColumns = @JoinColumn(name = "role_id")
            )
    private Collection<RoleEntity> roleEntities;
}//end class