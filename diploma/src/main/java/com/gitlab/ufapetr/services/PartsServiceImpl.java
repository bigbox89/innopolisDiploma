package com.gitlab.ufapetr.services;

import com.gitlab.ufapetr.forms.PartForm;
import com.gitlab.ufapetr.models.Part;
import com.gitlab.ufapetr.repositories.PartsRepository;
import com.gitlab.ufapetr.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PartsServiceImpl  implements PartsService{
    private final PartsRepository partsRepository;
    private final ProductsRepository productsRepository;
    @Autowired
    public PartsServiceImpl(PartsRepository partsRepository, ProductsRepository productsRepository) {
        this.partsRepository = partsRepository;
        this.productsRepository = productsRepository;
    }

    @Override
    public void addPart(PartForm form) {

        Part part = Part.builder()
                .product(form.getProduct())
                .description(form.getDescription())
                .price(form.getPrice())
                .quantity(form.getQuantity())
                .build();

        partsRepository.save(part);
    }

    @Override
    public List<Part> getAllParts() {
        return partsRepository.findAll();
    }

    @Override
    public void deletePart(Integer partId) {
        partsRepository.deleteById(partId);
    }

    @Override
    public Part getPart(Integer partId) {
        return partsRepository.getById(partId);
    }

    @Override
    public void updatePart(Integer partId, PartForm form) {
        Part part = partsRepository.getById(partId);
        part.setDescription(form.getDescription());
        part.setPrice(form.getPrice());
        part.setQuantity(form.getQuantity());
        partsRepository.save(part);
    }
}
