/*
 *
 */
package org.trellisldp.drastic;

import java.time.Instant;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.apache.commons.rdf.api.Dataset;
import org.apache.commons.rdf.api.IRI;
import org.apache.commons.rdf.api.Triple;
import org.trellisldp.api.Resource;
import org.trellisldp.spi.ResourceService;

/**
 * @author ajs6f
 */
public class DrasticResourceService implements ResourceService {

    @Override
    public Optional<Resource> get(final IRI identifier) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Resource> get(final IRI identifier, final Instant time) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean put(final IRI identifier, final Dataset dataset) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Supplier<String> getIdentifierSupplier() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Stream<IRI> compact(final IRI identifier, final Instant from, final Instant until) {
        // it is not necessary to implement this
        throw new UnsupportedOperationException("Resource listing not supported");
    }

    @Override
    public Stream<IRI> purge(final IRI identifier) {
        // it is not necessary to implement this
        throw new UnsupportedOperationException("Resource listing not supported");
    }

    @Override
    public Stream<? extends Triple> list(final String partition) {
        // it is not necessary to implement this
        throw new UnsupportedOperationException("Resource listing not supported");
    }
}
