package deliver.bank.domain.user.entities;

import deliver.bank.domain.user.entities.enumerator.UserStatus;
import deliver.bank.domain.user.entities.enumerator.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    private Long id;
    @Column(unique=true)
    private String identifier;
    private String fullName;
    private Address address;
    private LocalDate birthday;
    private UserType userType;
    private String email;
    private String telephone;
    private String password;
    private UserStatus userStatus;
    private LocalDateTime createdAt;
}