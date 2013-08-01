package org.dna.mqtt.moquette;

/**
 *
 * @author andrea
 */
public class MQTTException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MQTTException() {
        super();
    }
    
    public MQTTException(String msg) {
        super(msg);
    }
    
    public MQTTException(Throwable cause) {
        super(cause);
    }

    public MQTTException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
