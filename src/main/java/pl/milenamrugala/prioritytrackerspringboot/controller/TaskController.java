package pl.milenamrugala.prioritytrackerspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.milenamrugala.prioritytrackerspringboot.model.Task;
import pl.milenamrugala.prioritytrackerspringboot.service.TaskService;


@Controller
@RequestMapping(value = "/priority-tracker")

public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        super();
        this.taskService = taskService;
    }

    @GetMapping("/list-tasks")
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "list-tasks";
    }

    @GetMapping("/add-task")
    public String addTask(Model model) {
        Task task = new Task();
        model.addAttribute("task", task);
        return "add-task";
    }

    @PostMapping("/add-task")
    public String saveTask(@ModelAttribute("task") Task task) {
        taskService.saveTask(task);
        return "redirect:/priority-tracker/list-tasks";
    }

    @GetMapping("/list-tasks/update")
    public String updateTask(@RequestParam("id") Long id, Model model) {
        model.addAttribute("task", taskService.getTaskById(id));
        return "edit-task";
    }

    @PostMapping("/list-tasks/update")
    public String saveEditTask(@ModelAttribute("task") Task task) {
        taskService.saveTask(task);
        return "redirect:/priority-tracker/list-tasks";
    }

    @GetMapping("/list-tasks/delete")
    public String deleteTask(@RequestParam("id") Long id, Model model) {
        taskService.deleteById(id);
        return "redirect:/priority-tracker/list-tasks";
    }

    @GetMapping("/list-tasks/delete-confirm")
    public String confirmDeleteTask(@RequestParam("id") Long id, Model model) {
        model.addAttribute("id", id);
        return "task-delete-confirm";
    }

}
