package com.todo.todoApplication.Controller;

import com.todo.todoApplication.Model.Task;
import com.todo.todoApplication.Service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskService.getTasks();
        model.addAttribute("tasks",tasks);
        return"tasks";
    }
    @PostMapping
    public String createTasks(@RequestParam String tittle){
       taskService.createTask(tittle);
        return"redirect:/tasks";
    }
    @GetMapping("/{taskId}/delete")
    public String deleteTasks(@PathVariable Long taskId){
     taskService.deleteTask(taskId);
        return"redirect:/tasks";
    }
    @GetMapping("/{taskId}/toggle")
    public String toggleTasks(@PathVariable Long taskId){
        taskService.toggleTask(taskId);
        return"redirect:/tasks";
    }
}
