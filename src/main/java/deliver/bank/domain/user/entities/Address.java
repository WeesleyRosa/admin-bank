package deliver.bank.domain.user.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String cep;
    private String city;
    private String country;
    private String houseNumber;
    private String streetName;
}
