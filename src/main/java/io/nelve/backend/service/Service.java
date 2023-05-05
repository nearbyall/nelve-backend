package io.nelve.backend.service;

import org.springframework.data.domain.Page;

import java.util.Optional;

/**
 * Service interface that delegates work to repository classes and performs business logic.
 * @param <T> type of the DTO object
 * @param <Id> object id
 */
public interface Service<T, Id> {

    /**
     * Gets all existing objects with provided type.
     * @return list of objects
     */
    Page<T> getAll(int page, int size);

    /**
     *  Gets object with the provided id.
     * @param id object id
     * @return optional object
     */
    Optional<T> getById(Id id);

    /**
     * Deletes object with the provided id.
     * @param id object id
     * @return optional deleted object
     */
    Optional<T> delete(Id id);

}
