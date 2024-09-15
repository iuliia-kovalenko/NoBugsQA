package api.models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Unicorn {
    private String name;
    private String tailColor;
    @SerializedName("_id")
    private String id;

}
