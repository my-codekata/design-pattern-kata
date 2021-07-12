package br.com.adriano.chainofresponsibility.budget;

public class ManagerBudgetHandler extends BaseBudgetHandler {
    @Override
    public CustomerBudget handle(CustomerBudget budget) {
        if (budget.getTotal() <= 5000) {
            System.out.println("O gerente tratou o orçamento");
            budget.setApproved(true);
            return budget;
        }
        return super.nextHandler.handle(budget);
    }
}
