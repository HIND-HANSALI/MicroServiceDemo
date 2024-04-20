package com.school.client;
import com.school.entity.StudentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {
    @GetMapping("/school/{school-id}")
    List<StudentResponse> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);
}
