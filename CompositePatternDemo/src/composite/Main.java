package composite;

public class Main {
    public static void main(String[] args) {

        Manager m1 = new Manager("Alice");
        Manager m2 = new Manager("Bob");

        Salesperson s1 = new Salesperson("John", m1);
        Salesperson s2 = new Salesperson("Emma", m2);

        SalesTeam team = new SalesTeam();
        team.addMember(m1);
        team.addMember(m2);
        team.addMember(s1);
        team.addMember(s2);

        team.payExpenses(100);
    }
}