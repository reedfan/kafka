package com.reed.ustc.rabbitMQ.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

/**
 * created by reedfan on 2019/4/14 0014
 */
public class ConnectionUtil {

    public static Connection getConnection() throws IOException{
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("47.101.47.253");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/reed");
        connectionFactory.setUsername("reed");
        connectionFactory.setPassword("reed");

        Connection connection = connectionFactory.newConnection();
        return connection;



    }

}
