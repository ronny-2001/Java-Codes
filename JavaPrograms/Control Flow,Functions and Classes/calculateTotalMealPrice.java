public class calculateTotalMealPrice {
//    public static void calculate_total_meal_price(double listedMealPrice,double tipRate,double taxRate){
//        double tip=tipRate * listedMealPrice;
//        double tax=taxRate * listedMealPrice;
//        double result=tip+tax+listedMealPrice;
//
//        System.out.println("Your total meal price is "+result);
//    }

    //Returning the result
    public static double calculate_total_meal_price(double listedMealPrice,double tipRate,double taxRate){
        double tip=tipRate * listedMealPrice;
        double tax=taxRate * listedMealPrice;
        double result=tip+tax+listedMealPrice;

        return result;
    }
   public static void main (String[] args){

//        calculate_total_meal_price(112.5,.20,.08);
//        calculate_total_meal_price(100.5,.20,.08);

       //calling function and assign to variable
       double groupTotalMealPrice=calculate_total_meal_price(112.5,.20,.08);
       double individualMealPriceIs=calculate_total_meal_price(100.5,.20,.08)/5;

       System.out.println("Your total meal price is "+groupTotalMealPrice);
       System.out.println("Individual meal price is "+individualMealPriceIs);
    }
}