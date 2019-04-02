package school.project.service.customService;

import school.project.models.custom.Parents;

import java.util.List;

public interface ParentsService {
    void save(Parents parents);

    List<Parents> findAll();

    Parents byId(Integer id);
}
