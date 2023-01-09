package MaasHesaplayici;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double sTax;
    double tBonus;
    double tSalary;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        if(this.salary >= 1000){
            sTax = (this.salary *3) / 100;
            tSalary = this.salary - sTax;
        }
        else{
            sTax = 0;
        }

    }

    public void bonus(){
        if(this.workHours > 40){
            int hours;
            hours=this.workHours - 40;
            tBonus = hours * 30;
            tSalary = this.salary + tBonus;
        }
        else{
            tBonus =0;
        }
    }

    public void raiseSalary(){
        int year;
        double variable;
        year = 2021 - this.hireYear;


        if(year >19){
            variable = (this.salary * 15) / 100;
            tSalary = this.salary + variable;
        }
        else if(year > 9 && year < 20){
            variable = (this.salary * 10) / 100;
            tSalary = this.salary + variable;
        }
         else if(year < 10){

            variable= (this.salary * 5) / 100;
            tSalary = this.salary + variable;
        }

    }


    public void toPrint() {
        double value = tBonus - sTax;

        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı : "+ this.salary);
        System.out.println("Çalışma Saati : "+ this.workHours);
        System.out.println("Başlangıç Yılı : "+ this.hireYear);
        System.out.println("Vergi : "+ sTax);
        System.out.println("Bouns : "+ tBonus);
        System.out.println("Maaş Artışı : " + (tSalary - this.salary));
        System.out.println("Vergi ile Bonuslar ile birlikte maaş : " + (this.salary + value));
        System.out.println("Toplam maaş : "+ tSalary);


    }


}
