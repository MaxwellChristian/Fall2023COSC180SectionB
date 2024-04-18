package _2024_sim_f;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Q1 {

    public static ArrayList<Employee> loadList(String connectionString) {

        try (Connection connection = DBHelper.connect(connectionString)) {

            if( connection != null ){
                ResultSet resultSet = DBHelper.execute(connection, DBHelper.sqlQuery);

                ArrayList<Employee> employees = new ArrayList<>();

                while (resultSet.next()) {

                    Employee employee = new Employee();

                    employee.setName(resultSet.getString("tName"));
                    employee.setLocation(resultSet.getString("tLocation"));
                    employee.setShiftHours(Long.parseLong(resultSet.getString("nShiftHours")));
                    employee.setTotalItemsSold(Long.parseLong(resultSet.getString("nTotalItemsSold")));

                    // Employee employee = new Employee(
                    // results.getString(1),
                    // results.getString(2),
                    // results.getLong(3),
                    // results.getLong(4)
                    // );

                    employees.add(employee);
                }

                return employees;
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    public static void storeAsCSV(List<Employee> lstEntries, String sFilePath) {

        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(sFilePath));
            lstEntries.forEach(employee -> {
                try {
                    dataOutputStream.writeUTF("%s\n".formatted(employee.getAsCSV()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static String[] getProvinceList(List<Employee> obList) {
        return obList.stream()
                .map(employee -> employee.getLocation().split(",")[1])
                .distinct()
                .sorted(String::compareTo)
                .toArray(String[]::new);
    }

    public static List<Employee> getEmployees(List<Employee> obList,
                                              Predicate<Employee> fp) {
        return obList.stream()
                .filter(fp)
                .sorted(Comparator.comparing(Employee::getShiftHours))
                .sorted(Comparator.comparing(Employee::getTotalItemsSold))
                .toList();

    }

    public static Employee getEmployee(List<Employee> obList, String sProvince) {
        return obList.stream()
                .filter(employee -> employee.getLocation().split(",")[1].equals(sProvince))
                .max(Comparator.comparing(Employee::getTotalItemsSold))
                .get();
    }

    public static List<Employee> hoursChanged(List<Employee> obList, Predicate<Employee> fpPred,
                                              Function<Double, Double> fpChange) {

        obList.stream()
                .filter(fpPred)
                .forEach(employee -> fpChange.apply(employee.getShiftHours()));

        return obList;
    }

}
