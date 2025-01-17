package sample;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee();
        employees[0].setName("山田");
        employees[0].setSalary(2000000);

        employees[1] = new Employee();
        employees[1].setName("海田");
        employees[1].setSalary(2200000);

        employees[0] = new Employee();
        employees[0].setName("川田");
        employees[0].setSalary(2400000);

        Material[] materials = new Material[4];

        materials[0] = new Material();
        materials[0].setName("金");
        materials[0].setCoat(10000);

        materials[1] = new Material();
        materials[1].setName("銀");
        materials[1].setCoat(5000);

        materials[2] = new Material();
        materials[2].setName("銅");
        materials[2].setCoat(1000);

        materials[0] = new Material();
        materials[0].setName("木");
        materials[0].setCoat(500);
        
        MedalFactory medalfactory = new MedalFactory();

        medalfactory.makeMedal(materials);

        System.out.println("製品名: " + medals.getName + "/価格: " + medals.getPrice);

    } 
}
