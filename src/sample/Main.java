package sample;

public class Main {
    public static void main(String[] args) {
        Manager yamada = new Manager();

        yamada.setName("Taro Yamada");
        yamada.setId(101);
        yamada.setSalary(80000.0);
        yamada.setDepartment("Sales");

        Manager suzuki = new Manager();
        suzuki.setName("Hanako Suzuki");
        suzuki.setId(102);
        suzuki.setSalary(90000.0);
        suzuki.setDepartment("Marketing");
        
        Manager tanaka = new Manager();
        tanaka.setName("Ichiro Tanaka");
        tanaka.setId(103);
        tanaka.setSalary(85000.0);
        tanaka.setDepartment("HR");

        Manager[] people ={yamada,suzuki,tanaka};
        
        for (Manager person :people){
            System.out.println("Name: " + person.getName());
            System.out.println("ID: "+ person.getId());
            System.out.println("Salary: " + person.getSalary());
            System.out.println("Department: "+ person.getDepartment());
            System.out.println();
        }
    }
}
