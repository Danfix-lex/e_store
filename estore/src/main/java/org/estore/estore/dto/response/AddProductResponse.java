package org.estore.estore.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddProductResponse {
    private String id;
    private String price;
    private String description;

}
