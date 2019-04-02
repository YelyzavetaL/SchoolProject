package school.project.service.customService;

import school.project.models.custom.Classteachers;
import school.project.models.custom.Students;
import school.project.models.functional.Classes;

import java.util.List;

public interface ClassteachersService {
    void save(Classteachers classteachers);

    List<Classteachers> findAll();

    Classteachers byId(Integer id);
}
