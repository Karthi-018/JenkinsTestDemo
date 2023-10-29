package org.example;

import lombok.Builder;

import java.util.*;

@Builder
public class StudentManagementSystem {

    public List<Student> addStudent()
    {
        List<Student> students = new ArrayList<>();

        List<String> names = Arrays.asList("Karthi","Siva","Yaazhini","Pavi","Murali","Thilakavathi");
        Random r = new Random();
        for(int i=1;i<=10;i++)
        {
            students.add(Student.builder()
                    .sid(i)
                    .studentName(names.get(r.nextInt(names.size())))
                    .marks(r.nextInt(60,90))
                    .build());
        }
        return students;
    }

    public List<String> sortName()
    {
        List<String> names = Arrays.asList("Karthi","Siva","Yaazhini","Pavi","Murali","Thilakavathi");
        Collections.sort(names);
        return  names;

    }

    public void searchName()
    {
        List<String> names = Arrays.asList("Karthi","Siva","Yaazhini","Pavi","Murali","Thilakavathi");
       int index = Collections.binarySearch(names,"Yaazhini");

        System.out.println(names.get(index));

    }

    public List<String> reverseName()
    {
        List<String> names = Arrays.asList("Karthi","Siva","Yaazhini","Pavi","Murali","Thilakavathi");
        Collections.sort(names);
        Collections.reverse(names);
        return  names;

    }

    public List<String> shuffleName()
    {
        List<String> names = Arrays.asList("Karthi","Siva","Yaazhini","Pavi","Murali","Thilakavathi");
        Collections.shuffle(names);
        return  names;

    }





}
