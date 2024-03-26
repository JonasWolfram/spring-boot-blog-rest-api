package de.jwolfram.blog.entities.audit;

import java.io.Serializable;
import java.time.Instant;

public class UserAudit implements Serializable {

    private static final Long serialVersionUID = 1L;

    private Instant createdAt;

    private Instant updatedAt;
}
