package org.example;

public class Main {
        public static void main(String[] args) {
                Student student1 = new Student(1, "John", "Doe");
                Student student2 = new Student(2, "Jane", "Smith");
                Student student3 = new Student(3, "Michael", "Johnson");

                StudentsGroup group = new StudentsGroup(student1);

                group.addStudent(student2);
                group.addStudent(student3);

                group.changeGroupLeader(student2);

                group.addTask("Learn encapsulation");
                group.addTask("Complete project");

                group.markTaskCompleted(student1, "Learn encapsulation");
                group.markTaskCompleted(student1, "Complete project");
                group.markTaskCompleted(student3, "Learn encapsulation");

                System.out.println("Group Leader: " + group.getGroupLeader().getFullName());

                System.out.println("Students in the group:");
                for (Student student : group.getStudentsList()) {
                        System.out.println(student.getFullName());
                }

                System.out.println("Tasks in the group:");
                for (String task : group.getTasksCompleted().keySet()) {
                        System.out.println(task + " - Completed by: " + group.getTasksCompleted().get(task));
                }
        }
    }
