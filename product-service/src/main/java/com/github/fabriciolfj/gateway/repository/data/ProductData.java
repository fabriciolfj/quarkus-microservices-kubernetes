package com.github.fabriciolfj.gateway.repository.data;

import com.github.fabriciolfj.entity.enuns.Status;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MongoEntity(collection = "product")
public class ProductData {

    private ObjectId id;
    private String code;
    private String name;
    private String price;
    private Status status;
}
