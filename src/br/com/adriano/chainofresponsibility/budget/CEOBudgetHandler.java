package br.com.adriano.chainofresponsibility.budget;

public class CEOBudgetHandler extends BaseBudgetHandler {
    @Override
    public CustomerBudget handle(CustomerBudget budget) {
        System.out.println("O CEO tratou o orçamento");
        budget.setApproved(true);
        return budget;
    }
}
