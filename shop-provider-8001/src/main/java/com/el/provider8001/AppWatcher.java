package com.el.provider8001;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.time.Instant;
import java.util.Arrays;

/**
 * 1. An ApplicationStartingEvent is sent at the start of a run, but before any processing except the registration of listeners and initializers.
 * 2. An ApplicationEnvironmentPreparedEvent is sent when the Environment to be used in the context is known, but before the context is created.
 * 3. An ApplicationPreparedEvent is sent just before the refresh is started, but after bean definitions have been loaded.
 * 4. An ApplicationReadyEvent is sent after the refresh and any related callbacks have been processed to indicate the application is ready to service requests.
 * 5. An ApplicationFailedEvent is sent if there is an exception on startup.
 *
 * @author neo.pan
 * @since 2018/09/04
 */
@Slf4j
public class AppWatcher implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationStartingEvent) {
            log.info("[APP] Starting... - {}", Arrays.toString(((ApplicationStartingEvent) event).getArgs()));
        } else if (event instanceof ApplicationEnvironmentPreparedEvent) {
            log.info("[APP] Environment: {}", ((ApplicationEnvironmentPreparedEvent) event).getEnvironment());
        } else if (event instanceof ApplicationPreparedEvent) {
            log.info("[APP] Bean count of application context: {}",
                ((ApplicationPreparedEvent) event).getApplicationContext().getBeanDefinitionCount());
        } else if (event instanceof ApplicationReadyEvent) {
            log.info("[APP] << -- READY -- >>");
        } else if (event instanceof ApplicationFailedEvent) {
            log.error("[APP] Error happened.", ((ApplicationFailedEvent) event).getException());
        } else {
            if (log.isTraceEnabled()) {
                log.trace("[APP] {} from {} at {}", event.getClass().getSimpleName(),
                    event.getSource().getClass().getSimpleName(), Instant.ofEpochMilli(event.getTimestamp()));
            }
        }
    }

}
