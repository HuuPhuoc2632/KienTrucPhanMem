package com.example.chatpubsubwithredis.Pub;

import redis.clients.jedis.Jedis;
public class Publisher {
    public static void publisher(String msg) {
        Jedis pub = new Jedis();
        pub.publish("test", msg);
        pub.close();
    }
}
