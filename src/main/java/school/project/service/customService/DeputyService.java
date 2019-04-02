package school.project.service.customService;

import school.project.models.custom.Deputy;
import school.project.models.custom.Teachers;

import java.util.List;

public interface DeputyService {
    void save(Deputy deputy);

    List<Deputy> findAll();

    Deputy byId(Integer id);

}
