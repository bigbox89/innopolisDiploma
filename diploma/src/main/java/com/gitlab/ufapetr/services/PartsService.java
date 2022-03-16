package com.gitlab.ufapetr.services;

import com.gitlab.ufapetr.forms.CustomerForm;
import com.gitlab.ufapetr.forms.PartForm;
import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.models.Part;

import java.util.List;


public interface PartsService {
    void addPart(PartForm form);
    List<Part> getAllParts();


    void deletePart(Integer partId);

    Part getPart(Integer part_id);

    void updatePart(Integer partId, PartForm form);
}
