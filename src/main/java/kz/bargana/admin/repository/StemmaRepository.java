package kz.bargana.admin.repository;

import kz.bargana.admin.model.entity.Stemma;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StemmaRepository extends PagingAndSortingRepository<Stemma, Long> {

    Page<Stemma> findByParentId(Long parentId, Pageable pageable);
}
