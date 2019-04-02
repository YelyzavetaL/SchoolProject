package school.project.service.impl.functionalImpl;

import school.project.dao.functionalDAO.ClassesDAO;
import school.project.models.custom.Classteachers;
import school.project.models.functional.Classes;
import school.project.service.functionalService.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClassesServiceImpl implements ClassesService {
   @Autowired
   ClassesDAO classesDAO;


    @Override
    public void save(Classes classes) {
        classesDAO.save(classes);

    }

    @Override
    public void delete(Classes classes) {
            classesDAO.delete(classes);
    }

    @Override
    public void deleteById(Integer id) {
        classesDAO.deleteById(id);
    }

    @Override
    public List<Classes> findAll() {
        return classesDAO.findAll();
    }

    @Override
    public Classes byId(Integer id) {
        return classesDAO.byId(id);
    }

    @Override
    public Integer maxById() {
        return classesDAO.maxById();
    }

    @Override
    public Classes byName(String name) {
        return classesDAO.byName(name);
    }
}
