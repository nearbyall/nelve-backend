package io.nelve.backend.service.resolver;

@FunctionalInterface
public interface DropboxActionResolver<T> {

    T perform() throws Exception;

}
