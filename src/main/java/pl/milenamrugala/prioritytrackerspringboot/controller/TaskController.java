package pl.milenamrugala.prioritytrackerspringboot.controller;

import org.springframework.stereotype.Controller;
import pl.milenamrugala.prioritytrackerspringboot.service.TaskService;

@Controller
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
}
