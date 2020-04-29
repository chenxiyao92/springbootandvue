package top.cxyhome.springbootandvue.config;

//import org.apache.catalina.connector.Connector;
//import org.apache.tomcat.util.descriptor.web.SecurityCollection;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置一个tomcat监听器 监听8080端口并将接口请求转到8081端口
 */
@Configuration
public class TomcatConfig {

//    @Bean
//    TomcatServletWebServerFactory tomcatServletWebServerFactory(){
//        TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
//        tomcatServletWebServerFactory.addAdditionalTomcatConnectors(createTomcatConnect());
//        return tomcatServletWebServerFactory;
//    }
//
//    private Connector createTomcatConnect(){
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        //Connector监听的http的端口号
//        connector.setPort(8080);
//        connector.setSecure(false);
//        //监听到http的端口号后转向到的https的端口号
//        connector.setRedirectPort(8081);
//        return connector;
//
//    }
}
