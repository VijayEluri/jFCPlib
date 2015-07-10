package net.pterodactylus.fcp.quelaton;

import java.io.File;
import java.io.InputStream;
import java.util.Optional;

import net.pterodactylus.fcp.Key;

/**
 * FCP command that inserts data into Freenet.
 *
 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
 */
public interface ClientPutCommand {

	ClientPutCommand named(String targetFilename);
	Keyed<Optional<Key>> redirectTo(String uri);
	Keyed<Optional<Key>> from(File file);
	Lengthed<Keyed<Optional<Key>>> from(InputStream inputStream);

}