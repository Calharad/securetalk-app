package pl.calharad.app.securetalk.ui.login

import ua.naiksoftware.stomp.Stomp
import ua.naiksoftware.stomp.StompClient

class WebSocket() {
    private var stompClient: StompClient = Stomp.over
            .over(Stomp.ConnectionProvider.OKHTTP, "ws://192.168.0.8:8080/chat")

    init {
        stompClient.connect()
        stompClient
    }
}