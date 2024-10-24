package com.semanticsquare.basics;

public class Menu {

    public static double getMenuItemPrice(int choice, boolean largeDrink) {
        double itemPrice = 0.0;

        // Your logic
        return switch(choice) {
            case 0 -> 0.0;
            case 1 -> 12.0;
            case 2 -> 8.0;
            case 3 -> 10.0;
            case 4-> 15.0;
            case 5-> 7.0;
            case 6-> 9.0;
            case 7-> {
                if (largeDrink)
                    yield  (3.0 + 1.0);
                else
                    yield 3.0;
            }
            case 8-> {
                if (largeDrink)
                    yield  (3.0 + 2.0);
                else
                    yield 3.0;
            }
            case 9-> 5.0;
            case 10-> 6.0;
            default-> 0.0;
        };

/*    switch(choice) {
            case 0:
                itemPrice = 0.0;
                break;
            case 1:
                itemPrice = 12.0;
                break;
            case 2:
                itemPrice = 8.0;
                break;
            case 3:
                itemPrice = 10.0;
                break;
            case 4:
                itemPrice = 15.0;
                break;
            case 5:
                itemPrice = 7.0;
                break;
            case 6:
                itemPrice = 9.0;
                break;
            case 7:
                itemPrice = 3.0;
                break;
            case 8:
                itemPrice = 3.0;
                break;
            case 9:
                itemPrice = 5.0;
                break;
            case 10:
                itemPrice = 6.0;
                break;
            default:
                itemPrice = 0.0;
        }

        return itemPrice;*/
    }

    public static double applyCoupon(String couponCode) {
//        double discount = 0.0;
        // Your logic
        return switch (couponCode) {
            case "SAVE4" -> 4.0;
            case "HAPPYHOUR" -> 5.0;
            case "SPECIAL3OFF" -> 3.0;
            case "SUNDAY2OFF", "GOODSTUDENT" -> 2.0;
            default -> 0.0;
        };
        /*switch (couponCode) {
            case "SAVE4":
                discount = 4.0;
                break;
            case "HAPPYHOUR":
                discount = 5.0;
                break;
            case "SPECIAL3OFF":
                discount = 3.0;
                break;
            case "SUNDAY2OFF":
                discount = 2.0;
                break;
            case "GOODSTUDENT":
                discount = 2.0;
                break;
            default:
                discount = 0.0;
        }
        return discount;*/
    }
}
