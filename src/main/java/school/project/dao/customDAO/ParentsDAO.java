package school.project.dao.customDAO;

import school.project.models.custom.Parents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ParentsDAO extends JpaRepository<Parents, Integer>{
    @Override
    List<Parents> findAll();

    @Query("select c from Parents c where c.id = :xxx")
    Parents byId(@Param("xxx") Integer id);


}
