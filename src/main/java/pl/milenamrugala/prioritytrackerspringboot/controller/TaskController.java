package pl.milenamrugala.prioritytrackerspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.milenamrugala.prioritytrackerspringboot.model.Task;
import pl.milenamrugala.prioritytrackerspringboot.service.TaskService;

import java.util.List;

@Controller
@RequestMapping(value = "/priority-tracker")

public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/list-tasks")
    public String listTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "list-tasks";
    }
}
