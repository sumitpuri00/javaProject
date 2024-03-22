package modelPackage;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString

public class employee {
    public String name;
    public String role;

}
