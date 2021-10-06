package kz.bargana.admin.controller;

import kz.bargana.admin.model.entity.Stemma;
import kz.bargana.admin.service.StemmaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/stemma")
public class StemmaController {
    private final StemmaService stemmaService;

    public StemmaController(StemmaService stemmaService) {
        this.stemmaService = stemmaService;
    }

    @GetMapping( "/all")
    public Page<Stemma> getAll(Pageable pageable) {
        return stemmaService.getAll(pageable);
    }

    @GetMapping("/parent/{parentId}")
    public Page<Stemma> getByParentId(@PathVariable Long parentId, Pageable pageable) {
        return stemmaService.getByParentId(parentId, pageable);
    }

    @GetMapping("/{id}")
    public Stemma getById(@PathVariable Long id) {
        return stemmaService.findById(id);
    }
}
