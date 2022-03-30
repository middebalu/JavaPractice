package sorting;

import sorting.comparators.AssendingOrder;

import java.util.*;
public class SortListOfObjects {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("kisore", 771, 1, "telugu", "hindi"));
        studentList.add(new Student("Mohit", 773, 2, "hindi", "telugu"));
        studentList.add(new Student("Ram", 789, 2, "hindi", "telugu"));
        studentList.add(new Student("Krishna", 778, 2, "hindi", "telugu"));
        studentList.add(new Student("Balaji", 780, 2, "hindi", "hindi"));
        for (Student stu : studentList) {
            System.out.println(stu.toString());
        }
        List<String> studentsName = new ArrayList<>(Arrays.asList("balaji", "Kumar", "krishna","ajam"));
        Collections.sort(studentsName);
        Collections.sort(studentList, new AssendingOrder());
        System.out.println(studentsName);
        System.out.println(studentList);
    }
}
 /*       //  studentList.stream().sorted(new sorting.comparators.AssendingOrder()).collect(Collectors.toList());
        studentList.sort((e1,e2) ->e1.rollNo- e2.rollNo);
        //Collections.sort(studentList, new sorting.comparators.AssendingOrder());
        System.out.println("----------after sorted -------");
        System.out.println(studentList);
        studentList.sort((e1,e2) ->e1.sName.compareTo(e2.sName));
        //Collections.sort(studentList, new sorting.comparators.AssendingOrder());
        System.out.println("----------after sorted -------");
        System.out.println(studentList);
    }
}*/
