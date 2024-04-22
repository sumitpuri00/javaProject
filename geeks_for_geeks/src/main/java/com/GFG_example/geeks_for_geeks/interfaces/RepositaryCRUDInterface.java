package com.GFG_example.geeks_for_geeks.interfaces;

import com.GFG_example.geeks_for_geeks.model.EntityModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositaryCRUDInterface extends CrudRepository<EntityModel,Long> {

    List<EntityModel> findByProductNameContainingIgnoreCase(String searach);
}
