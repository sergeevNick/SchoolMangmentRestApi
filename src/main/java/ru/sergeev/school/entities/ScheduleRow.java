package ru.sergeev.school.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "SCHEDULE_ROWS")
public class ScheduleRow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROW_ID")
    private Integer scheduleRowId;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Schedule.class)
    @JoinColumn(name = "SCHEDULE_ID", nullable = false)
    private Schedule schedule;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Lesson.class)
    @JoinColumn(name = "LESSON_ID", nullable = false)
    private Lesson lesson;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    @JoinColumn(name = "TEACHER_ID", nullable = false)
    private User teacher;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Subject.class)
    @JoinColumn(name = "SUBJECT_ID", nullable = false)
    private Subject subject;

    public ScheduleRow() {
    }

    public Subject getSubject() {
        return subject;
    }

    public User getTeacher() {
        return teacher;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public Integer getScheduleRowId() {
        return scheduleRowId;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void setScheduleRowId(Integer scheduleRowId) {
        this.scheduleRowId = scheduleRowId;
    }
}
