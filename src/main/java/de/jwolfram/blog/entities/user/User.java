package de.jwolfram.blog.entities.user;

import de.jwolfram.blog.entities.audit.DateAudit;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "username"), @UniqueConstraint(columnNames = "email")})
public class User extends DateAudit {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "first_name")
    @Size(max = 40)
    private String first_name;

    @NotBlank
    @Column(name = "last_name")
    @Size(max = 40)
    private String last_name;

    @NotBlank
    @Column(name = "username")
    @Size(max = 40)
    private String username;

    @NotBlank
    @Column(name = "password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contact_id")
    private Contact contact;

    public User(String first_name, String last_name, String username, String password, Contact contact) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.contact = contact;
    }
}
