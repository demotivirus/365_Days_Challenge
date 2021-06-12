package com.demotivirus.Day_166;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class ImageImageMicroserviceImpl implements ImageMicroservice {
    @Override
    public String getPath() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpGet = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:8080/image")) //fake http
                .build();

        try {
            HttpResponse<String> response = httpClient.send(httpGet, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
