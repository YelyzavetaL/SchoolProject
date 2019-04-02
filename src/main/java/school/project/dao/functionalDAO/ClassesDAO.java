package school.project.dao.functionalDAO;

import school.project.models.User;
import school.project.models.custom.Classteachers;
import school.project.models.functional.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ClassesDAO extends JpaRepository<Classes, Integer> {

    @Override
    void delete(Classes classes);

    @Override
    void deleteById(Integer id);

    @Override
    List<Classes> findAll();

    @Query("select c from Classes c where c.id = :xxx")
    Classes byId(@Param("xxx") Integer id);

    @Query("select max(c.id) from Classes c" )
    Integer maxById();

    @Query("select c from Classes c where c.name = :xxx")
    Classes byName(@Param("xxx") String name);

}
