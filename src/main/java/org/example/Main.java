package org.example;

public class Main {
    public static void main(String[] args) {
            Student student1 = new Student(1, "John", "Doe");
            Student student2 = new Student(2, "Jane", "Smith");

            System.out.println("Student 1 ID: " + student1.getStudentId());
            System.out.println("Student 1 Full Name: " + student1.getFullName());

            StudentsGroup group = new StudentsGroup(student1);

            group.addStudent(student2);

            System.out.println("Group Leader: " + group.getGroupLeader().getFullName());

            Student newLeader = new Student(3, "Michael", "Johnson");
            group.changeGroupLeader(newLeader);
            System.out.println("New Group Leader: " + group.getGroupLeader().getFullName());

            group.addTask("Learn encapsulation");
            group.addTask("Complete project");

            System.out.println("Tasks in the group:");
            for (String task : group.getTasksList()) {
                System.out.println(task);
            }

            group.markTaskCompleted(student1, 0);

            System.out.println("Completed tasks for " + student1.getFullName() + ": " + group.getCompletedTasks(student1));
        }
    }
