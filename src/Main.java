public class Main {
    public static void main (String[] args)
    {
        Employee[]employees= {
                new Employee("Jevgenijs Feofantovs",
                        "QA Tester",
                        "zfeofantovs@gmail.com",
                        "07770622742",1000,
                        25),
                new Employee("Elina Verkova",
                        "Social media",
                        "velina@gmail.com",
                        "0778382832",
                        2000,
                        24),
                new Employee("Konstantin Krasnov",
                        "Web `Developer",
                        "konstantin@gmail.com",
                        "074758489934",
                        6000,
                        30),
                new Employee("Raisa  Krasmova",
                        "Retaired",
                        "raisa@gmail.com",
                        "0749349239423",
                        1000,
                        55),
                new Employee("Vladimur Krilov",
                        "programmer",
                        "vlad@gmail.com",
                        "0743193124",
                        10000,
                        50)
        };

        int minAge = 10;
        for (Employee employee : employees) {
            if (employee.age > minAge) {
                employee.printInfo();
                System.out.println();
            }
        }
        }

}
