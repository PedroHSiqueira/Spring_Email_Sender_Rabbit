package dev.siqueira.email.domain;

import dev.siqueira.email.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_EMAIL")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailModel {

    private final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String emailSubject;
    @Column(columnDefinition = "TEXT")
    private String emailBody;
    private LocalDateTime sendDateEmail;
    private EmailStatus statusEmail;
}
