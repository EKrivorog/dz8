package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class StudentsGroup {
    private Student groupLeader;
    private List<Student> studentsList;
    private Map<String, List<Student>> tasksCompleted;

    public StudentsGroup(Student groupLeader) {
        this.groupLeader = groupLeader;
        this.studentsList = new ArrayList<>();
        this.studentsList.add(groupLeader);
        this.tasksCompleted = new HashMap<>();
    }

    public void changeGroupLeader(Student newLeader) {
        if (!studentsList.contains(newLeader)) {
            studentsList.add(newLeader);
        }
        this.groupLeader = newLeader;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void removeStudent(Student student) {
        if (student != groupLeader) {
            studentsList.remove(student);
            tasksCompleted.values().forEach(students -> students.remove(student));
        } else {
            System.out.println("Cannot remove the group leader from the students list.");
        }
    }

    public void addTask(String task) {
        tasksCompleted.put(task, new ArrayList<>());
    }

    public void markTaskCompleted(Student student, String task) {
        if (student == null) {
            System.out.println("Cannot mark task completed for null student.");
            return;
        }

        if (studentsList.contains(student) && tasksCompleted.containsKey(task)) {
            List<Student> studentsCompletedTask = tasksCompleted.get(task);
            if (!studentsCompletedTask.contains(student)) {
                studentsCompletedTask.add(student);
            }
        } else {
            System.out.println("Invalid student or task.");
        }
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public Map<String, List<Student>> getTasksCompleted() {
        return tasksCompleted;
    }
}