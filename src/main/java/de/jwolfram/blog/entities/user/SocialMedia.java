package de.jwolfram.blog.entities.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.jwolfram.blog.entities.audit.UserDateAudit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@Table(name = "social_media")
public class SocialMedia extends UserDateAudit {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url_linked_in")
    private String url_linkedIn;

    @Column(name = "url_xing")
    private String url_xing;

    @Column(name = "url_website")
    private String url_website;

    @Column(name = "url_tiktok")
    private String url_tiktok;

    @Column(name = "url_x")
    private String url_x;

    @Column(name = "url_facebook")
    private String url_facebook;

    @Column(name = "url_instagram")
    private String url_instagram;

    public SocialMedia(String url_linkedIn, String url_xing, String url_website, String url_tiktok, String url_x, String url_facebook, String url_instagram) {
        this.url_linkedIn = url_linkedIn;
        this.url_xing = url_xing;
        this.url_website = url_website;
        this.url_tiktok = url_tiktok;
        this.url_x = url_x;
        this.url_facebook = url_facebook;
        this.url_instagram = url_instagram;
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
