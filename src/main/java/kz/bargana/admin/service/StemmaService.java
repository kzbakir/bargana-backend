package kz.bargana.admin.service;

import kz.bargana.admin.exception.BarganaException;
import kz.bargana.admin.exception.ExceptionCode;
import kz.bargana.admin.model.entity.Stemma;
import kz.bargana.admin.repository.StemmaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StemmaService {
    private final StemmaRepository stemmaRepository;

    @Autowired
    public StemmaService(StemmaRepository stemmaRepository) {
        this.stemmaRepository = stemmaRepository;
    }

    public Page<Stemma> getAll(Pageable pageable) {
        return stemmaRepository.findAll(pageable);
    }

    public Page<Stemma> getByParentId(Long id, Pageable pageable) {
        return stemmaRepository.findByParentId(id, pageable);
    }

    public Stemma findById(Long id) {
        Stemma stemma = stemmaRepository.findById(id).orElse(null);
        if (stemma == null) {
            throw new BarganaException("User is not found", ExceptionCode.MEMBER_NOT_FOUND);
        }
        return stemma;
    }
}
