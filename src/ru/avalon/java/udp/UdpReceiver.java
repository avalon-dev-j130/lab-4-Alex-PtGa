package ru.avalon.java.udp;

import java.io.*;
import java.net.*;

/**
 * Упражнение, на правленное на выработку умений, связанных с полученеим
 * сообщений, отправленных с использование протокола UDP.
 *
 * @author Daniel Alpatov
 */
public final class UdpReceiver {

    public static void main(String[] args) throws IOException {
        // 1. Формиоуем буффер, для хранения получаемых данных.
        final byte[] buffer = prepareBuffer();
        // 2. Формируем пакет, на основе созданного буфера.
        final DatagramPacket packet = preparePacket(buffer);
        // 3. Выбираем порт, на который ожидается получение сообщения.
        final int port = 0;
        // 4. Формируем сокет, связанный с выбранным портом.
        final DatagramSocket socket = prepareSocket(port);
        // 5. Получаем сообщение.
        socket.receive(packet);
        // 6. На основании данных пакета формируем текстовое сообщение.
        final String message = getMessage(packet);
        // 7. Освобождаем ресурсы.
        socket.close();
    }

    /**
     * Возвращает буффер, который будет использован для храрнения получаемых
     * данных.
     *
     * @return двоичный массив.
     */
    private static byte[] prepareBuffer() {
        /*
         * TODO Реализовать метод prepareBuffer класса UdpReceiver
         */
        final int MAX_MESSAGE_SIZE = 1024;
        byte[] buffer = new byte[MAX_MESSAGE_SIZE];
        return buffer;
//        throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Упаковывает переданный двоичный массив (буффер) в экземпляр типа
     * {@link DatagramPacket}.
     *
     * @param buffer буффек, который будет использован пакетом для хранения
     * получаемых данных.
     *
     * @return экземпляр типа {@link DatagramPacket}.
     */
    static DatagramPacket packet = null;

    private static DatagramPacket preparePacket(byte[] buffer) {
        /*
         * TODO Реализовать метод preparePacket класса UdpReceiver
         */
        packet = new DatagramPacket(buffer, buffer.length);
        return packet;
        // throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Возвращает сокет, связанный с указанным портом.
     *
     * @param port порт.
     *
     * @return сокет.
     */
    private static DatagramSocket prepareSocket(int port) throws SocketException, IOException {
        /*
         * TODO Реализовать метод prepareSocket класса UdpReceiver
         */
        DatagramSocket socket = new DatagramSocket(port);
        socket.receive(packet);
        return socket;

        //       throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Преобразует данные, содержащиеся в полученном пакете в текстовое
     * представление.
     *
     * @param packet пакет.
     *
     * @return строковое сообщение.
     */
    private static String getMessage(DatagramPacket packet) throws UnsupportedEncodingException {
        /*
         * TODO Реализовать метод getMessage класса UdpReceiver
         */    
        String message = new String(packet.getData());         
 //       throw new UnsupportedOperationException("Not implemented yet!");
        return message;
    }
}
