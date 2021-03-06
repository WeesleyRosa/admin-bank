package deliver.bank.config.exception.response;

import deliver.bank.config.exception.enumerator.ErrorCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ErrorResponse {

    private ErrorCodeEnum code;
    private String message;

}
