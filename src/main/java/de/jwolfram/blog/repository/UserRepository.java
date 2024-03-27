package de.jwolfram.blog.repository;

import de.jwolfram.blog.entities.user.User;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Find user by name.
     */
    Optional<User> findByUsername(@NotBlank String username);

    /**
     * Find user by email.
     */
    Optional<User> findByEmail(@NotBlank String email);

    /**
     * Exists by username.
     */
    Boolean existsByUsername(@NotBlank String username);

    /**
     * Exists by email
     */
    Boolean existsByEmail(@NotBlank String email);

    /**
     * Find username or email.
     */
    Optional<User> findByUsernameOrEmail(String username, String email);
}
