package Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamCollectorsTest {
    public static void main(String[] args) {

    }

    public static void testFiltering() {
        Map<String, List<Employee>> empGroupedByDept = Employee.employees()
                                                        .stream()
                                                        .collect(groupingBy(Employee::getDepartment, toList()));


        System.out.println("Группировка работников по отделам:");
        System.out.println(empGroupedByDept);

        Map<String, List<Employee>> empSalaryGt1900GroupedByDept = Employee.employees()
                                                                    .stream()
                                                                    .filter(e -> e.getSalary() > 1900)
                                                                    .collect(groupingBy(Employee::getDepartment, toList()));


        System.out.println("\n Группировка работников с зарплатой > 1900 по отделам");
        System.out.println(empSalaryGt1900GroupedByDept);


        Map<String, List<Employee>> empGroupedByDeptWithSalaryGt1900 = Employee.employees()
                                                                        .stream()
                                                                        .collect(groupingBy(Employee::getDepartment, filtering(e -> e.getSalary() > 1900.00, toList())));
        System.out.println("\nГруппировка работников с зарплатой > 1900 по отделам:");
        System.out.println(empGroupedByDeptWithSalaryGt1900);

        Map<String, List<Employee>> empByDeptWith2LangWithEn = Employee.employees()
                                                                .stream()
                                                                .collect(groupingBy(Employee::getDepartment,
                                                                        filtering(e -> e.getSpokenLanguages().size() >= 2
                                                                            && e.getSpokenLanguages().contains("English"),
                                                                                toList())));
        System.out.println("\n Группировка по отделам работников, владеющих мин 2 языками, "
                            + " один из которых английский");
        System.out.println(empByDeptWith2LangWithEn);



    }

    public static void testFlatMapping() {
        Map<String, Set<List<String>>> langByDept = Employee.employees()
                .stream()
                                                        .collect(groupingBy(Employee::getDepartment,
                                                                                mapping(Employee::getSpokenLanguages, toSet())));

        System.out.println("\n Языки, сгруппированные по отделам с помощью mapping():");
        System.out.println(langByDept);

        Map<String, Set<String>> langByDept2 = Employee.employees()
                                                .stream()
                                                .collect(groupingBy(Employee::getDepartment,
                                                        flatMapping(e -> e.getSpokenLanguages().stream(), toSet())));


        System.out.println("\n Языки, сгруппированные по отделам с помощью flatMapping():");
        System.out.println(langByDept2);
    }
}
