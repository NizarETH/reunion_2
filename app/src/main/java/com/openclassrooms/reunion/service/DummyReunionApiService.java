package com.openclassrooms.reunion.service;

import com.openclassrooms.reunion.model.Reunion;


import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyReunionApiService implements  ReunionApiService {

    private List<Reunion> reunion = DummyReunionGenerator.generateReunion();


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Reunion> getReunion() {
        return reunion;
    }


    /**
     * {@inheritDoc}
     * @param reunion
     */
    @Override
    public void deleteReunion(Reunion reunion) {
        reunion.remove(reunion);
    }

    /**
     * {@inheritDoc}
     * @param reunion
     */
    @Override
    public void createReunion(Reunion reunion) {
        reunion.add(reunion);
    }
}
