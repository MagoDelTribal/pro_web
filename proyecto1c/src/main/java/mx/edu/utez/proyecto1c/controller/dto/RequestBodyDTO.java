
package mx.edu.utez.proyecto1c.controller.dto;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestBodyDTO {
    @Size(min = 3, message = "el nombre debe tener al menos 3 caracteres")
    private String nombre;

    @Min(value = 18, message = "debe ser mayor de edad")
    private int edad;

    @Email(message = "el formato no es valido ")
    private String email;

    @Pattern(
            regexp = "^[A-Z][AEIOUX][A-Z]{2}\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\\d|3[01])[HM](?:AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TL|TS|VZ|YN|ZS|NE)[BCDFGHJKLMNPQRSTVWXYZ]{3}[A-Z\\d]\\d$",
            message = "La CURP no tiene un formato válido"
    )
    private String curp;


}




