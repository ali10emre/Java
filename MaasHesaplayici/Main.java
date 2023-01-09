package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee a = new Employee("kemal",2000, 45,1985);
        a.tax();
        a.bonus();
        a.raiseSalary();
        a.toPrint();


    }
}
