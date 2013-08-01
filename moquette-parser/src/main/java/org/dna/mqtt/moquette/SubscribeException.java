package org.dna.mqtt.moquette;

/**
 *
 * @author andrea
 */
public class SubscribeException extends ConnectionException {

	private static final long serialVersionUID = 1L;

	public SubscribeException(String msg) {
        super(msg);
    }

    public SubscribeException(Throwable e) {
        super(e);
    }
}
