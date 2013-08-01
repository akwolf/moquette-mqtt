package org.dna.mqtt.moquette;

/**
 *
 * @author andrea
 */
public class PublishException extends ConnectionException {

	private static final long serialVersionUID = 1L;

	public PublishException(String msg) {
        super(msg);
    }

    public PublishException(Throwable e) {
        super(e);
    }
}
