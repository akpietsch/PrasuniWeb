package dh.master.info.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dh.master.info.model.Locale;

@Repository
public interface LocaleRepository extends CrudRepository<Locale, Integer> {

	public Locale findOneById(Integer localeId);

	public List<Locale> findAll();

	public Page<Locale> findAll(Pageable pageable);

}
