package com.example.transform;

import com.google.gson.Gson;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

public class PojoProtoUtil {

    public static <T> T toPojo(Message message, Class<T> cls)
            throws InvalidProtocolBufferException {
        String json = JsonFormat.printer().print(message);
        return new Gson().fromJson(json, cls);
    }

    public static void toProto(Object pojo, Message.Builder builder)
            throws InvalidProtocolBufferException {
        String json = new Gson().toJson(pojo);
        JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
    }
}
