package sample;

public class MedalFactory {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Medal[] makeMedal(Material[] materials){
        int totalSalaly = 0;
        for (Employee employee : employees){
            totalSalaly += employee.getEmployee.getSalary;
        }
        
        Medal[] medals = new Medal[4];
        
        for (Material material : materials){
            if ( material.name == "金"){
                medals.setName ("金メダル");
            } 
            else if (material.name == "銀"){
                medals.setName ("銀メダル");
            }    
            else if (material.name == "銅"){
                medals.setName ("銅メダル");
            }
            else {
                medals.setName("不良品");
                medals.setPrice(0);
            }

            medals.setPrice(materials.cost + ( totalSalaly/"medals.lenght")*1.2 );

            
        }    

    }

    


}
