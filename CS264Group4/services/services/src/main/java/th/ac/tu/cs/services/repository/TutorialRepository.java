package th.ac.tu.cs.services.repository;
import java.util.List;

import th.ac.tu.cs.services.model.Tutorial;

public interface TutorialRepository {
    int save(Tutorial tu);
    int save1(Tutorial tu);
    int save2(Tutorial tu);
    int save3(Tutorial tu);

    Tutorial findById(String id);

    List<Tutorial> findAll();

    int deleteAll();

    int update(Tutorial tu);

}