package org.vaadin.elmot.flow.sensors;

import java.io.Serializable;
import java.util.EventListener;

public interface PositionErrorListener extends EventListener, Serializable {
    public void onError(PositionErrorEvent event);
}
