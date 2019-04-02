package school.project.service.impl.customImpl;

import school.project.dao.customDAO.ParentsDAO;
import school.project.models.custom.Parents;
import school.project.service.customService.ParentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentsServiceImpl implements ParentsService{

    @Autowired
    ParentsDAO parentsDAO;

    @Override
    public void save(Parents parents){
        parentsDAO.save(parents);
    }

    @Override
    public List<Parents> findAll() {
        return parentsDAO.findAll();
    }

    @Override
    public Parents byId(Integer id) {
        return parentsDAO.byId(id);
    }
}
