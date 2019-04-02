package school.project.service.functionalService;

import school.project.models.functional.Classes;
import school.project.models.functional.Subjects;

import java.util.List;

public interface SubjectsService {

    void save(Subjects subjects);

    void delete(Subjects subjects);

    void deleteById(Integer id);

    List<Subjects> findAll();

    Integer maxByIdSub();

    Subjects byId(Integer id);


}
