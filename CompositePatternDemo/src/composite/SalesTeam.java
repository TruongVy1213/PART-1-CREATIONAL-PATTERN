package composite;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {

    private List<Payee> members = new ArrayList<>();

    public void addMember(Payee p) {
        members.add(p);
    }

    @Override
    public void payExpenses(int amount) {
        for (Payee p : members) {
            p.payExpenses(amount);
        }
    }
}