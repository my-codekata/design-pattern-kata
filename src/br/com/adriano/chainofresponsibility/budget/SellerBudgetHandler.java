package br.com.adriano.chainofresponsibility.budget;

public class SellerBudgetHandler extends BaseBudgetHandler {
    @Override
    public CustomerBudget handle(CustomerBudget budget) {
        if (budget.getTotal() <= 1000) {
            System.out.println("O vendedor tratou o orçamento");
            budget.setApproved(true);
            return budget;
        }
        return super.nextHandler.handle(budget);
    }
}
