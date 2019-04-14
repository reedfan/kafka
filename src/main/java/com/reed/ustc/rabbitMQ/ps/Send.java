package com.reed.ustc.rabbitMQ.ps;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.reed.ustc.rabbitMQ.util.ConnectionUtil;

/**
 * created by reedfan on 2019/4/14 0014
 */
public class Send {
    private final static String EXCHANGE_NAME = "test_exchange_fanout";
    public static void main(String[] argv) throws Exception {
        // 获取到连接以及mq通道
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        // 声明exchange
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
        // 消息内容
        String message = "test for rabbitmq in publish/subscribe mode";
        channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
        System.out.println(" Send： '" + message + "'");

        channel.close();
        connection.close();
    }




}
