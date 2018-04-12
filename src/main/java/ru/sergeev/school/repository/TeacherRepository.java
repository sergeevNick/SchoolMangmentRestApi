package ru.sergeev.school.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sergeev.school.entities.Name;
import ru.sergeev.school.entities.ScheduleRow;
import ru.sergeev.school.entities.Teacher;

import java.util.Set;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {
}
