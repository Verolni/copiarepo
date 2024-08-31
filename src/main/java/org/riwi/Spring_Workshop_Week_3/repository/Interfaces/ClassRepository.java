package org.riwi.Spring_Workshop_Week_3.repository.Interfaces;

package org.riwi.Spring_Workshop_Week_3.repository.Interfaces;


import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassRepository extends JpaRepository<Course,Long> {

    @Query("SELECT c FROM c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR LOWER(c.description) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<course> searchByKeyword(@Param("keyword") String keyword);
}
