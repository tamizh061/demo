package mycodes.FundamentalJava.ArrayFolder.arraytasks;

public class task_o4 {
    int [][] numbers={{13,26,39},{52,65,78},{91,21,34}};

    public  void method()
    {
    for(int row=0;row<numbers.length;row++)
    {
        for(int column=0;column< numbers.length;column++)
        {
            System.out.print(numbers[row][column]+" ");
        }
    }
        System.out.println();
    for (int rows=0;rows< numbers.length;rows++)
    {
        for(int columns=0;columns< numbers.length;columns++)
        {
         if(rows==0){
             if(columns==0)
             {
                 numbers[rows][columns]=65;
             }
             else if (columns==1)
             {
                 numbers[rows][columns]=52;
             }
             else if (columns==2)
             {
                 numbers[rows][columns]=13;
             }
             else
             {
                 return;
             }
         }
            if(rows==1){
                if(columns==0)
                {
                    numbers[rows][columns]=26;
                }
                else if (columns==1)
                {
                    numbers[rows][columns]=39;
                }
                else if (columns==2)
                {
                    numbers[rows][columns]=78;
                }
                else
                {
                    return;
                }
            }
            if(rows==2){
                if(columns==0)
                {
                    numbers[rows][columns]=34;
                }
                else if (columns==1)
                {
                    numbers[rows][columns]=21;
                }
                else if (columns==2)
                {
                    numbers[rows][columns]=91;
                }
                else
                {
                    return;
                }
            }
            System.out.print(numbers[rows][columns]+" ");
        }

    }
        System.out.println();
    for(int rows1= 2;rows1>=0;rows1--)
    {
        for (int column1= 2;column1>=0;column1--)
        {
            System.out.print(numbers[rows1][column1]+" ");
        }
    }

    }



    public static void main(String[] args) {
        task_o4 obj=new task_o4();
        obj.method();
    }
}
