package school.project.service.customService;

import school.project.models.custom.Students;
import school.project.models.functional.Classes;

import java.util.List;

public interface StudentsService {
    void save(Students students);

    List<Students> findAll();

    Students byId(Integer id);

    List<Students>  byClassId(Integer id);


}
