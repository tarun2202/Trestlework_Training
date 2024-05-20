package tech.trestlework.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//why creating the dto(ProductResponse) : good practice to seperate the entity and dto, ideally it is not recommended to expose the entity to the outside world,
//because in the future if i added new necessary attributes to the entity, then those should not be exposed to outside world.
/* Reduced Data Transfer Overhead: DTOs allow you to transfer only the required data between layers or across network boundaries.
   This helps in reducing the amount of data transferred, which can improve performance, especially in distributed systems with limited bandwidth.*/

public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
