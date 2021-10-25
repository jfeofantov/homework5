public class Employee {
    String fullName; // Полное имя , Фамилия
    String position; // Позиция на работе
    String email ; // email adress
    String phoneNumber; // номер телеофна
    float salary; // зарплата
    int age; // возвраст

    Employee(
            String fullName,
            String position,
            String email,
            String phoneNumber,
            float salary,
            int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age =age;
    }

    void printInfo()
    {
        System.out.println("Full name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("e-mail :" + email);
        System.out.println("Phone number :" + phoneNumber);
        System.out.println("Salary:" + salary);
        System.out.println("Age :" + age);
    }

}

