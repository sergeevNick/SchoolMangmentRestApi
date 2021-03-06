package ru.sergeev.school.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ru.sergeev.school.Application
import spock.lang.Specification

@SpringBootTest(classes = Application.class)
class GradeRepositorySpec extends Specification {
    @Autowired
    private GradeRepository gradeRepository

    private final GRADE_LIST_SIZE = 3

    def "should return all grades"() {
        expect:
        gradeRepository.findAllByOrderByNumberAsc().size() == GRADE_LIST_SIZE
    }
}