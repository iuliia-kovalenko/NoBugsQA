package org.example.task2hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TaskManager {
    private ArrayList<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(String description) {
        Task tasktToRemove = null;
        for (Task task: taskList) {
            if (task.getDescription().equals(description)) {
                tasktToRemove = task;
            }
        } taskList.remove(tasktToRemove);
        assert tasktToRemove != null;
        System.out.println("Task: " + "*" + tasktToRemove.getDescription() + "* was removed sucessfully");
    }

    public void sortedList() {
        Collections.sort(taskList, Comparator.comparingInt(Task::getPriority));
        for (Task task : taskList) {
            task.print();
        }
    }
}
