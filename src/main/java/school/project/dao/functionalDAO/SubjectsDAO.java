package school.project.dao.functionalDAO;

import school.project.models.functional.Classes;
import school.project.models.functional.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubjectsDAO extends JpaRepository<Subjects, Integer> {

    @Override
    void delete(Subjects subjects);

    @Override
    void deleteById(Integer id);

    @Override
    List<Subjects> findAll();

    @Query("select q from Subjects q where q.id = :xxx")
    Subjects byId(@Param("xxx") Integer id);

    @Query("select max(q.id) from Subjects q" )
    Integer maxByIdSub();




}
