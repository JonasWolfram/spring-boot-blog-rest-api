package de.jwolfram.blog.entities.role;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

@Entity
@Data
@NoArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(name = "role_name")
    private RoleName roleName;

    public Role(RoleName roleName) {
        this.roleName = roleName;
    }
}
