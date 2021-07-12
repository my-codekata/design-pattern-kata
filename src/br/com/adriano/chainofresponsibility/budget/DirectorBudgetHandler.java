package br.com.adriano.chainofresponsibility.budget;

public class DirectorBudgetHandler extends BaseBudgetHandler {
    @Override
    public CustomerBudget handle(CustomerBudget budget) {
        if (budget.getTotal() <= 50000) {
            System.out.println("O diretor tratou o orçamento");
            budget.setApproved(true);
            return budget;
        }
        return super.nextHandler.handle(budget);
    }
}
