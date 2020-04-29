package top.cxyhome.springbootandvue;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootandvueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootandvueApplication.class, args);
//        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(SpringbootandvueApplication.class);
//        springApplicationBuilder.bannerMode(Banner.Mode.OFF).run(args);
    }

}
