package com.lex.gamestorelib.service;

import com.lex.gamestorelib.model.entity.Series;
import com.lex.gamestorelib.model.exceptions.SeriesNotFoundException;

import java.util.List;

public interface SeriesService {
    void createSeries(String title);
    void updateSeries(Integer id, String series) throws SeriesNotFoundException;
    void deleteSeries(Integer id);
    List<Series> getSeries();
    Series getSeries(Integer id) throws SeriesNotFoundException;
}
