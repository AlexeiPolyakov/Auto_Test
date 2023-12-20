package models.RequestModel;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObjectRequest {
    public int id;
    public CategoryRequest category;
    public String name;
    public ArrayList<String> photoUrls;
    public ArrayList<TagRequest> tags;
    public String status;
}
