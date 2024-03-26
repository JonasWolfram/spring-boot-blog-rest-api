package de.jwolfram.blog.entities.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.jwolfram.blog.entities.audit.UserDateAudit;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@Table(name = "contact")
public class Contact extends UserDateAudit {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @NotBlank
    @Column(name = "email")
    @Email
    private String email;

    @NotBlank
    @Column(name = "phone")
    private String phone;

    @NotBlank
    @Column(name = "street")
    private String street;

    @NotBlank
    @Column(name = "street_number")
    private String street_number;

    @NotBlank
    @Column(name = "plz")
    private int plz;

    @NotBlank
    @Column(name = "city")
    private String city;

    @OneToOne(mappedBy = "contact")
    private User user;

    public Contact(String email, String phone, String street, String street_number, int plz, String city, User user) {
        this.email = email;
        this.phone = phone;
        this.street = street;
        this.street_number = street_number;
        this.plz = plz;
        this.city = city;
        this.user = user;
    }

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    @Override
    public Long getCreatedBy() {
        return super.getCreatedBy();
    }

    @JsonIgnore
    @Override
    public void setCreatedBy(Long createdBy) {
        super.setCreatedBy(createdBy);
    }

    @JsonIgnore
    @Override
    public Long getUpdatedBy() {
        return super.getUpdatedBy();
    }

    @JsonIgnore
    @Override
    public void setUpdatedBy(Long updatedBy) {
        super.setUpdatedBy(updatedBy);
    }

    @JsonIgnore
    @Override
    public Instant getCreatedAt() {
        return super.getCreatedAt();
    }

    @JsonIgnore
    @Override
    public void setCreatedAt(Instant createdAt) {
        super.setCreatedAt(createdAt);
    }

    @JsonIgnore
    @Override
    public Instant getUpdatedAt() {
        return super.getUpdatedAt();
    }

    @JsonIgnore
    @Override
    public void setUpdatedAt(Instant updatedAt) {
        super.setUpdatedAt(updatedAt);
    }

}
