package sdf;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {

    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPERATOR = "\n";
    public static final String FILE_HEADER = "staffNo,fullName,department,role,emailAddress,salary";

    public List<Employee> employees = null;
    public List<Employee>generateEmployees() {
        employees = new ArrayList<Employee>();

        Employee emp1 = new Employee("12345", "Mr Brown", "Marketing", "Mascot", "mrbrown@mrbrown.com", 897642);
        Employee emp2 = new Employee("43453", "Mr Grey", "Accounting", "Manager", "mrgrey@mrbrown.com", 765473);
        Employee emp3 = new Employee("8747", "Ms Violet", "Sales", "Staff", "msviolet@mrbrown.com", 123452);
        Employee emp4 = new Employee("84752", "Ms Pink", "IT", "Programmer", "mspink@mrbrown.com", 817341);

        employees.add(emp2);
        employees.add(emp1);
        employees.add(emp3);
        employees.add(emp4);
        return employees;
    }

    public void writeToCSV(List<Employee>employees,String fileName) throws IOException{
        FileWriter fw = new FileWriter(fileName);

        //write file_header to CSV
        fw.append(FILE_HEADER.toString());
        fw.append(NEWLINE_SEPERATOR);

        //read records row by row and write it using fw.append
        for(Employee e:employees){
            // fw.append(COMMA_DELIMITER);
            fw.append(e.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAddress());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueOf(e.getSalary()));
            fw.append(COMMA_DELIMITER);
            fw.append(NEWLINE_SEPERATOR);
        }

        fw.flush();
        fw.close();
    }

}
