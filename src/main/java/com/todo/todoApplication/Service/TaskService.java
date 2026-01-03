package com.todo.todoApplication.Service;

import com.todo.todoApplication.Model.Task;
import com.todo.todoApplication.Repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String tittle) {
        Task task = new Task();
        task.setTaskTittle(tittle);
        task.setTaskCompletion(false);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("INVALID ID"));
                task.setTaskCompletion(!task.isTaskCompletion());
        taskRepository.save(task);
    }
}
