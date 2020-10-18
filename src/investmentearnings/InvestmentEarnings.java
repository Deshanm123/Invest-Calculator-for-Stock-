package investmentearnings;
import java.util.Scanner;
import java.text.*;

public class InvestmentEarnings {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your buying price per share : ");
        
//        setting the calculations up to two decimal places
        DecimalFormat decimalSettings= new DecimalFormat("0.000");
        
        double buyingPrice  = scan.nextDouble();
        int day = 1;
        double closingPrice;
        
        System.out.println("****To Exit Enter -1 ***" );
        while(true){
             System.out.println("------Day "+ day+" ----");
            System.out.print("Enter the closing price for day " + day +" :" );
            closingPrice = scan.nextDouble();
            
            if(closingPrice < 0.0) break;           
            
            
//            calculating Earinings
            double earnings = closingPrice-buyingPrice;
//            show earnings
             
           
             if(earnings>0.0)
              System.out.println("you have earned " +decimalSettings.format(earnings));
            
            else if(earnings<0.0)
                System.out.println("you have losed "+decimalSettings.format(-earnings));
            
           else
                System.out.println("you have no earnings");
         
         day++;
            
     }
    scan.close();
   }
}
