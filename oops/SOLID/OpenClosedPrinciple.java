// Open for extension, closed for modification
interface Discount {
    double apply();
}

class StudentDiscount implements Discount {
    public double apply() {
        return 10;
    }
}

class SeniorDiscount implements Discount {
    public double apply() {
        return 20;
    }
}

class DiscountCalculator {
    double calculate(Discount d) {
        return d.apply();
    }
}

//Wrong Practice XXXX
// class DiscountCalculator {
//     double calculate(String type) {
//         if(type.equals("Student")) return 10;
//         if(type.equals("Senior")) return 20;
//         return 0;
//     }
// }
