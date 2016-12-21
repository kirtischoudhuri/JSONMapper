package net.davismol.jsonsubclassing;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class  MyCustomDeserializer extends KeyDeserializer
{
    @Override
    public Object deserializeKey( final String key,
                                  final DeserializationContext ctxt )
       throws IOException, JsonProcessingException
    {
        return null;
    }
}

class ExampleJacksonModule extends SimpleModule
{
    public ExampleJacksonModule()
    {
        addKeyDeserializer(
            MyMap.class,
            new MyCustomDeserializer() );
    }
}
