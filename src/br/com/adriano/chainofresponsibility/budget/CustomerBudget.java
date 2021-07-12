package br.com.adriano.chainofresponsibility.budget;

public class CustomerBudget {
    private boolean approved;
    private Long total;

    public CustomerBudget(Long total) {
        approved = false;
        this.total = total;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Long getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "CustomerBudget{" +
                "approved=" + approved +
                ", total=" + total +
                '}';
    }
}
