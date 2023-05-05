package io.nelve.backend.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.*;
import lombok.experimental.Accessors;

import java.util.Set;

@Entity
@Table(name = "skills")
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "skill")
    private Set<UserSkill> userSkills;
}
