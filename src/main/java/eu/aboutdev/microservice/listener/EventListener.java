package eu.aboutdev.microservice.listener;

import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RabbitListener
public class EventListener {

    private static Logger LOG = LoggerFactory.getLogger(EventListener.class);

    @Queue("q.backend-queue")
    public boolean receiveEvent(final String eventId) {
        LOG.info("Received Event with Id: {}", eventId);
        return true;
    }
}
