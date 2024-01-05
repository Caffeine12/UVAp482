import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cases=  sc.nextInt();
        String blank = sc.nextLine();

        while(cases>0)
            {
            
            String blankTwo = sc.nextLine();
            String order = sc.nextLine();
            String numbers = sc.nextLine();
            String[] orderArr = order.split(" ");
            String[] numbersArr = numbers.split(" ");
            for(int j=1; j<=orderArr.length;j++)
            {
                for(int k=0; k<orderArr.length;k++)
                {
                    if (j==Integer.parseInt(orderArr[k]))
                    {
                        System.out.println(numbersArr[k]);
                        break;
                    }
                }
            } 
            System.out.println();                     
            cases--;
        }
        sc.close();
    }
}
