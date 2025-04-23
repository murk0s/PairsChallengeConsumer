package sia.pairschallenge.event;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductEvent2 implements Serializable{

        private int id;

        private String name;

        private String description;

        private BigDecimal price;

        private Integer quantity;

        private LocalDateTime createdAt;

        private LocalDateTime updatedAt;

        private String message;

}
