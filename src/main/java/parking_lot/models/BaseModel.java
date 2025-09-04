package parking_lot.models;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {

    private String id;
    private Date createdAt;
    private Date lastModifiedAt;
    private String address;
    private String capacity;


}
