package mycodes.FundamentalJava.Fullstackk.datas;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class grocery {
    private String name;
    private int price;
    private int ratings;
    public grocery(){
    }
}
