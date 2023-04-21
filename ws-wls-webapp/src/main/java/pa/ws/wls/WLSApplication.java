package ru.alfabank.pc.uoks.pa.ws_dev.wls;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Configuration
@Import(WLSApplication.EchoController.class)
public class WLSApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WLSApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WLSApplication.class);
    }

    @ResponseBody
    @RequestMapping("/")
    static class EchoController {

        @GetMapping("/")
        public ResponseEntity<String> getVersion() {
            return ResponseEntity.ok("Test node");
        }
    }
}
