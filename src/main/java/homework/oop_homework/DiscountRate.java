package homework.oop_homework;

public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

     static public  double getServiceDiscountRate(String type) {

        if ("Premium".equalsIgnoreCase(type)) {
            return serviceDiscountPremium;
        }
        else if ("Gold".equalsIgnoreCase(type)) {
            return serviceDiscountGold;
        }
        else if ("Silver".equalsIgnoreCase(type)) {
            return serviceDiscountSilver;
        }

        return 0.0;
    }

    public static double getProductDiscountRate(String type) {

        if ("Premium".equalsIgnoreCase(type)) {
            return productDiscountPremium;
        }
        else if ("Gold".equalsIgnoreCase(type)) {
            return productDiscountGold;
        }
        else if ("Silver".equalsIgnoreCase(type)) {
            return productDiscountSilver;
        }

        return 0.0;
    }

}
