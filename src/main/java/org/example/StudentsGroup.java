package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentsGroup {
    private Student groupLeader;
    private List<Student> studentsList;
    private List<String> tasksList;
    private Map<Student, List<Integer>> completedTasks;

    public StudentsGroup(Student groupLeader) {
        this.groupLeader = groupLeader;
        this.studentsList = new ArrayList<>();
        this.tasksList = new ArrayList<>();
        this.completedTasks = new HashMap<>();
    }

    public void changeGroupLeader(Student newLeader) {
        this.groupLeader = newLeader;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
        completedTasks.put(student, new ArrayList<>());
    }

    public void removeStudent(Student student) {
        studentsList.remove(student);
        completedTasks.remove(student);
    }

    public void addTask(String task) {
        tasksList.add(task);
    }

    public void markTaskCompleted(Student student, int taskIndex) {
        if (studentsList.contains(student) && taskIndex >= 0 && taskIndex < tasksList.size()) {
            List<Integer> studentCompletedTasks = completedTasks.get(student);
            if (!studentCompletedTasks.contains(taskIndex)) {
                studentCompletedTasks.add(taskIndex);
            }
        }
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public List<String> getTasksList() {
        return tasksList;
    }

    public List<Integer> getCompletedTasks(Student student) {
        return completedTasks.get(student);
    }
}