package school.project.service.functionalService;

import school.project.models.functional.Classes;

import java.util.List;

public interface ClassesService {

    void save(Classes classes);

    void delete(Classes classes);

    void deleteById(Integer id);

    List<Classes> findAll();

    Classes byId(Integer id);

    Integer maxById();

    Classes byName(String name);
}
