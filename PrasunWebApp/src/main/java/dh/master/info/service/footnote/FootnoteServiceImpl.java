package dh.master.info.service.footnote;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import dh.master.info.model.Footnote;
import dh.master.info.repository.FootnoteRepository;

@Component
//@Transactional
public class FootnoteServiceImpl implements FootnoteService {

	private final FootnoteRepository footnotes;

	public FootnoteServiceImpl(FootnoteRepository footnotes) {
		this.footnotes = footnotes;
	}

	@Override
	public Long count() {
		return footnotes.count();
	}

	@Override
	public Footnote save(Footnote footnote) {
		return footnotes.save(footnote);
	}

	@Override
	public Footnote getOneById(Integer footnoteId) {
		return footnotes.findOneById(footnoteId);
	}

	@Override
	public List<Footnote> getAll() {
		return footnotes.findAll();
	}

	@Override
	public Page<Footnote> getAll(Pageable pageable) {
		return footnotes.findAll(pageable);
	}

}
