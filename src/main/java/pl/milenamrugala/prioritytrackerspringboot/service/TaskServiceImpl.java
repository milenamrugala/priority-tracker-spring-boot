package pl.milenamrugala.prioritytrackerspringboot.service;

import org.springframework.stereotype.Service;
import pl.milenamrugala.prioritytrackerspringboot.model.Task;
import pl.milenamrugala.prioritytrackerspringboot.repository.TaskRepository;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

}
