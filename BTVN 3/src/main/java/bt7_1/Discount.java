package bt7_1;

public class Discount {
    private Customer customer;
    private double serviceDiscountRate;
    private double productDiscountRate;

    public Discount(Customer customer) {
        this.customer = customer;
        setServiceDiscountRate();
        setProductDiscountRate();
    }

    public double getServiceDiscountRate() {
        return serviceDiscountRate;
    }

    public double getProductDiscountRate() {
        return productDiscountRate;
    }

    public void setServiceDiscountRate() {
        if (customer.isMember()) {
            String type = customer.getMemberType();
            if (type.equals("Premium")) {
                serviceDiscountRate = 0.2;
            } else if (type.equals("Gold")) {
                serviceDiscountRate = 0.15;
            } else if (type.equals("Silver")) {
                serviceDiscountRate = 0.1;
            }
        } else {
            serviceDiscountRate = 0;
        }
    }

    public void setProductDiscountRate() {
        productDiscountRate = 0.1;
    }

    public double getServiceDiscount(double serviceExpense) {
        return serviceExpense * serviceDiscountRate;
    }

    public double getProductDiscount(double productExpense) {
        return productExpense * productDiscountRate;
    }

    public double getTotalExpense(double serviceExpense, double productExpense) {
        double totalExpense = serviceExpense - getServiceDiscount(serviceExpense) + productExpense - getProductDiscount(productExpense);
        return totalExpense;
    }
}
