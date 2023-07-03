package pl.milenamrugala.prioritytrackerspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milenamrugala.prioritytrackerspringboot.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}