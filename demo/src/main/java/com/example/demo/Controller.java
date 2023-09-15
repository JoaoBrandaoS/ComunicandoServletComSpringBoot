package com.example.demo;

import java.net.MalformedURLException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import com.example.demo.DadosModel;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class Controller {

    @PostMapping("/middle/teste")
    public String teste(@RequestBody DadosModel dados) {
        String result = "metodo teste";
     

        final String endereco = "http://localhost:8081/treinamento/primeiroservlet";

        try {
            RestTemplate template = new RestTemplate();
        	
            HttpHeaders leitor = new HttpHeaders();
            
            
            leitor.setContentType(MediaType.APPLICATION_JSON);
            
            UriComponentsBuilder conversor =  UriComponentsBuilder.fromHttpUrl(endereco).queryParam("nome",dados.getNome()).queryParam("email", dados.getEmail());
            
            HttpEntity<String> entidadeParaEnvio = new HttpEntity<>(leitor);
            ResponseEntity<String> enviarEntenidade = template.exchange(conversor.toUriString(), HttpMethod.POST,entidadeParaEnvio,String.class) ;
            
        	URL url = new URL(endereco);
            

            int status = enviarEntenidade.getStatusCodeValue();
            System.out.println(status);
            

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (IOException e) {
            // TODO Auto-generated catch blAock
            e.printStackTrace();
        }

        return result;
    }
}