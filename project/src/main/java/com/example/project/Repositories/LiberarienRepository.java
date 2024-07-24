package com.example.project.Repositories;

import org.springframework.data.jpa.repository.Query;

public interface LiberarienRepository {

    @Query("SELECT CASE WHEN COUNT(b) > 0 THEN 'true' ELSE 'false' END FROM Book b WHERE b.name = ?1 And b.numOfKids = ?2")
    public Boolean existbyname(String name, int numOfKids);
}
