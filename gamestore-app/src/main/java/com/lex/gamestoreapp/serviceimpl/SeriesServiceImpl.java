package com.lex.gamestoreapp.serviceimpl;

import com.lex.gamestorelib.model.entity.Series;
import com.lex.gamestorelib.model.exceptions.SeriesNotFoundException;
import com.lex.gamestorelib.repository.SeriesRepository;
import com.lex.gamestorelib.service.SeriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeriesServiceImpl implements SeriesService {
    private final SeriesRepository seriesRepository;

    @Override
    public void createSeries(String title) {
        seriesRepository.save(new Series(title));
    }

    @Override
    public void updateSeries(Integer id, String title) throws SeriesNotFoundException {
        Series series = seriesRepository.findById(id).orElseThrow(() -> new SeriesNotFoundException(id));
        series.setTitle(title);
        seriesRepository.save(series);
    }

    @Override
    public void deleteSeries(Integer id) {
        seriesRepository.deleteById(id);
    }

    @Override
    public List<Series> getSeries() {
        return seriesRepository.findAll();
    }

    @Override
    public Series getSeries(Integer id) throws SeriesNotFoundException {
        return seriesRepository.findById(id).orElseThrow(() -> new SeriesNotFoundException(id));
    }
}
