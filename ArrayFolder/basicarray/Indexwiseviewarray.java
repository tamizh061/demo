package mycodes.FundamentalJava.ArrayFolder.basicarray;

public class Indexwiseviewarray {
    public static void main(String[] args) {
        Long ElectricityBillNo[] = {875466387617873l, 3877636536722l, 832763657663l, 472767635267367378l, 678673676737672l, 127873882l};
        int startingValue = 0;
        int endvalue = 3;
        int count = 1;
        for (; startingValue < endvalue; startingValue++) {
            System.out.println("count no :" + count);
            System.out.println(ElectricityBillNo[startingValue]);
            count++;
        }
    }
}
