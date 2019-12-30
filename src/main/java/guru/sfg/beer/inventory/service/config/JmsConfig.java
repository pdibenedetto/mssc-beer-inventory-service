package guru.sfg.beer.inventory.service.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
public class JmsConfig
{
    public static final String NEW_INVENTORY_QUEUE = "new-inventory";
    public static final String ALLOCATE_ORDER_QUEUE = "allocate-order";
    public static final String ALLOCATE_ORDER_RESPONSE_QUEUE = "allocate-order-response";
    public static final String JMS_MSG_CONVERTER_TYPE_ID_PROPERTY_NAME = "_type";

    // ObjectMapper is Autowired here
    @Bean
    public MessageConverter messageConverter(ObjectMapper objectMapper)
    {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName(JMS_MSG_CONVERTER_TYPE_ID_PROPERTY_NAME);
        converter.setObjectMapper(objectMapper);
        return converter;
    }
}
