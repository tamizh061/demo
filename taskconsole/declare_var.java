package mycodes.FundamentalJava.taskconsole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class declare_var implements Comparable<declare_var> {
    private String names;
    private int one_kg;
    private double weight;
    private int ratings;

    @Override
    public int compareTo(declare_var o) {
        return this.getNames().compareTo(o.getNames());
    }


}