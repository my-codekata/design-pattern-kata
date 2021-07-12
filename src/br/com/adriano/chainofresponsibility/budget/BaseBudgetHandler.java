package br.com.adriano.chainofresponsibility.budget;

public abstract class BaseBudgetHandler {
    protected  BaseBudgetHandler nextHandler;

    public BaseBudgetHandler setNextHandler(BaseBudgetHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public CustomerBudget handle(CustomerBudget budget) {
        if (this.nextHandler == null) return this.nextHandler.handle(budget);
        return budget;
    }
}
