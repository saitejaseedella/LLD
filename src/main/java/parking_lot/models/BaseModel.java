package parking_lot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel {

    private String id;
    private Date createdAt;
    private Date lastModifiedAt;
    private String address;
    private String capacity;


}
