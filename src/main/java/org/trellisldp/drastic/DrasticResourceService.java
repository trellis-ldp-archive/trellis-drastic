/*
 *
 */
package org.trellisldp.drastic;

import java.time.Instant;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.apache.commons.rdf.api.Dataset;
import org.apache.commons.rdf.api.IRI;
import org.apache.commons.rdf.api.Quad;
import org.apache.commons.rdf.api.RDFTerm;
import org.apache.commons.rdf.api.Triple;
import org.trellisldp.api.Resource;
import org.trellisldp.spi.ResourceService;

public class DrasticResourceService implements ResourceService {

	@Override
	public Optional<Resource> get(IRI identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Resource> get(IRI identifier, Instant time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(IRI identifier, Dataset dataset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<IRI> getContainer(IRI identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<IRI> compact(IRI identifier, Instant from, Instant until) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<IRI> purge(IRI identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Triple> list(String partition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFTerm skolemize(RDFTerm term) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFTerm unskolemize(RDFTerm term) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Quad> export(String partition, Collection<IRI> graphNames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier<String> getIdentifierSupplier() {
		// TODO Auto-generated method stub
		return null;
	}

}
