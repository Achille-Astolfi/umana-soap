package umanasoap.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import umanasoap.application.entity.Course;

public interface CoursesRepository extends JpaRepository<Course, Long> {

}
