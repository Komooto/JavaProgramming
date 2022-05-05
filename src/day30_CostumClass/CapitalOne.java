package day30_CostumClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Muhemmetjan", 2001, 'M', "Counter", 8500, false);

        Employee employee2 = new Employee();
        employee2.setInfo("Kamile", 1027, 'F', "Secretary", 8700, true);

        Employee employee3 = new Employee();
        employee3.setInfo("Kamalet", 8013, 'F', "BO", 9000, true);

        Employee employee4 = new Employee();
        employee4.setInfo("Kamiljan", 1224, 'M', "CEO", 11200, true);

        Employee employee5 = new Employee();
        employee5.setInfo("Rehime", 1025, 'F', "CFO", 9300, false);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        int fullTime = 0;
        int partTime = 0;
        int min = employee1.salary;
        int max = employee1.salary;

        for (Employee employee : employees) {
            if (employee.isFullTime){
                fullTime ++;
            }
            if (!employee.isFullTime){
                partTime ++;
            }
            if (employee.salary < min){
                min = employee.salary;
            }
            if (employee.salary > max){
                max = employee.salary;
            }

        }

        System.out.println(min);
        System.out.println(max);
        System.out.println("Number of full time worker is: " + fullTime);
        System.out.println("Number of part time worker is: " + partTime);
        employee1.work();
















    }
}
