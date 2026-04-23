package composite;

public class Manager implements Payee {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println(name + " (Manager) paid " + amount + " dollars");
    }
}