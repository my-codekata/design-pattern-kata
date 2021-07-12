package br.com.adriano.chainofresponsibility.budget;

public class TesteBudget {
    public static void main(String[] args) {
        CustomerBudget customerBudget1 = new CustomerBudget(10L);
        CustomerBudget customerBudget2 = new CustomerBudget(5000L);
        CustomerBudget customerBudget3 = new CustomerBudget(5001L);
        CustomerBudget customerBudget4 = new CustomerBudget(50001L);

        SellerBudgetHandler seller = new SellerBudgetHandler();
        seller
            .setNextHandler(new ManagerBudgetHandler())
            .setNextHandler(new DirectorBudgetHandler())
            .setNextHandler(new CEOBudgetHandler());

        seller.handle(customerBudget1);
        System.out.println(customerBudget1);
        System.out.println("=================");
        System.out.println("");

        seller.handle(customerBudget2);
        System.out.println(customerBudget2);
        System.out.println("=================");
        System.out.println("");

        seller.handle(customerBudget3);
        System.out.println(customerBudget3);
        System.out.println("=================");
        System.out.println("");

        seller.handle(customerBudget4);
        System.out.println(customerBudget4);
        System.out.println("=================");
        System.out.println("");
    }
}
