package org.dna.mqtt.moquette;

/**
 *
 * @author andrea
 */
public class ConnectionException extends MQTTException {

	private static final long serialVersionUID = 1L;

	public ConnectionException(String msg) {
        super(msg);
    }

    public ConnectionException(Throwable e) {
        super(e);
    }
}
