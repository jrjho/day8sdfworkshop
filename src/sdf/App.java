package sdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class App {

    public List<Employee> newEmployees = null;
    public static void main(String[] args) throws IOException {

        String dirPath = "data";
        String fileName = "data.txt";

        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if (isDirCreated)
            System.out.println("New directory " + dirPath + " created");
        else
            System.out.println("Directory " + dirPath + " already exists!");

        File newFile = new File(dirPath + "/" + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated)
            System.out.println("New file " + fileName + " created");
        else
            System.out.println("File " + fileName + " already exists!");

        // fos returns ASCI code. a lot of work
        FileOutputStream fos = new FileOutputStream(newFile, true);

        for (int i = 0; i < 10; i++) {
            char str[] = Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');
        }
        String welcomeMessage = "Welcome to ISS";
        // convert string to byte array using getBytes()
        byte[] outputData = welcomeMessage.getBytes();
        fos.write(outputData);
        // clear the outputstream
        // data data to store to the file destination
        fos.flush();
        fos.close();

        String fileEmployee = "employee.txt";
        boolean isEmployeeFileCreated = newFile.createNewFile();

        if (isEmployeeFileCreated)
            System.out.println("New file " + fileEmployee + " created");
        else
            System.out.println("File " + fileEmployee + " already exists!");

        CSVWriter cw = new CSVWriter();

        cw.writeToCSV(cw.generateEmployees(), dirPath + "/" + fileEmployee);

        FileReader fr = new FileReader(dirPath + "/" + fileEmployee);
        BufferedReader br = new BufferedReader(fr);
        String line;
        FileWriter writer = new FileWriter(dirPath + "/" + "copy_"+fileEmployee) ;
        String[] itemsToAdd = null;
        // List<Employee> newEmployees = new ArrayList<Employee>();
        // newEmployees = new ArrayList<Employee>();

        while (null != (line = br.readLine())) {
            System.out.printf("%s\n",line);
            writer.write(line);
            itemsToAdd = line.trim().split(",");
        }
        // System.out.printf("%s\n",itemsToAdd.toString());

        br.close();
        fr.close();
        writer.flush();
        writer.close();

        // *****************************************************
        // ArraySortExample sortedArray = new ArraySortExample();
        // CollectionSortExample cse = new CollectionSortExample();
        // HashMapExample hme = new HashMapExample();
        // HashTableExample hte = new HashTableExample();
        // ConcurrentHashMapExample chme = new ConcurrentHashMapExample();
        // LinkedListExample lle = new LinkedListExample();
        // StackExample se = new StackExample();

        // // sortedArray.example();
        // // sortedArray.sortInt();
        // // cse.example01();
        // // cse.example02();
        // // hme.example();
        // // hte.example();
        // // chme.example();
        // // lle.example();
        // se.example();
        // *****************************************************

    }
}