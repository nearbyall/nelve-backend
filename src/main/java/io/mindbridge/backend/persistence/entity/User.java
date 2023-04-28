package io.mindbridge.backend.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "user")
    private Set<UserSkill> userSkills;

    @OneToMany(mappedBy = "user")
    private Set<UserGroup> userGroups;

    @OneToMany(mappedBy = "user")
    private Set<UserEvent> userEvents;

    @OneToMany(mappedBy = "user")
    private Set<Resource> resources;

    @OneToMany(mappedBy = "user")
    private Set<Rating> ratings;

}
