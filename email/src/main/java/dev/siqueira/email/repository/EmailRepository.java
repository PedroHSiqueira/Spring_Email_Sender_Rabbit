package dev.siqueira.email.repository;

import dev.siqueira.email.domain.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Integer> {
}
