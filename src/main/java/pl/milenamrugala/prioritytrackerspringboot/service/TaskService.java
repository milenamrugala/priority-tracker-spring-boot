package pl.milenamrugala.prioritytrackerspringboot.service;

import pl.milenamrugala.prioritytrackerspringboot.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    Task saveTask(Task task);

    Task updateTask(Task task);

    Task getTaskById(Long id);

    void deleteById(Long id);
}