package com.product.demo.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    @Id
    @GeneratedValue(generator = "uuidgenerator")
    @GenericGenerator(name = "uuidgenerator" , strategy = "uuid2")
    @Column(name = "id", columnDefinition = "binary(16)" , nullable = false , updatable = false)
    private UUID id;
}
