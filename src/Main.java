public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Смирнов Максим Александрович", 1, 100_000);
        employees[1] = new Employee("Коновалов Игорь Алексеевич", 2, 120_000);
        employees[2] = new Employee("Иванов Сергей Игоревич", 3, 200_000);
        employees[3] = new Employee("Климов Андрей Варельевич", 1, 80_000);

        printNameAllEmployee();
        System.out.println(getCalculateSumSalary());
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getEmployeeAverageSalary());
        printFullNameAllEmployee();
    }

    public static void printNameAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getCalculateSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee employeeMin = null;
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMin = employees[i];
            }
        }
        return employeeMin;
    }

    public static Employee getEmployeeMaxSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee employeeMax = null;
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeMax = employees[i];
            }
        }
        return employeeMax;
    }

    public static double getEmployeeAverageSalary() {
       double sum = 0;
       int countEmp = 0;
        for (Employee emp : employees) {
            if (emp == null) continue;
            countEmp++;
            sum += emp.getSalary();
        }
        return sum/ countEmp;
    }

    public static void printFullNameAllEmployee (){
        for (Employee empl : employees) {
            if (empl == null) continue;
            System.out.println(empl.getFullName());
        }
    }
}