package school.project.service.impl.functionalImpl;

import school.project.dao.functionalDAO.SubjectsDAO;
import school.project.models.functional.Classes;
import school.project.models.functional.Subjects;
import school.project.service.functionalService.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsServiceImpl implements SubjectsService {



    @Autowired
    SubjectsDAO subjectsDAO;

    @Override
    public void save(Subjects subjects) {
        subjectsDAO.save(subjects);
    }


    @Override
    public void delete(Subjects subjects) {
        subjectsDAO.delete(subjects);
    }

    @Override
    public void deleteById(Integer id) {
        subjectsDAO.deleteById(id);
    }


    @Override
    public List<Subjects> findAll() {
        return subjectsDAO.findAll();
    }

    @Override
    public Integer maxByIdSub() {
        return subjectsDAO.maxByIdSub();    }

//    @Override
//    public Subjects byId(Integer id) {
////        return subjectsDAO.byId(id);
//        return subjectsDAO.byId(id);
//    }

@Override
    public Subjects byId(Integer id){
        return subjectsDAO.byId(id);
}



}
