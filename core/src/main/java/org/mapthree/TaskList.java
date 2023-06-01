package org.mapthree;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
public class TaskList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Optional<Task> getTask(int index) {
        if (index >= 0 && index < tasks.size())
            return Optional.of(tasks.get(index));
        else
            return Optional.empty();
    }

    public int size() {
        return tasks.size();
    }
}