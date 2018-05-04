package config.init;

import config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*INICIO DE TUDO. Aqui será direcionado as Mappings para suas devidas controllers e aq sera chamada a classe de
* Configuração de Servlet.  Resumindo: Aq será passada a mapping e a classe de configuração da servlet*/

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {



    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }
    //Passando a classe de Configuração de Servlet
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    //Mapping principal para todos. ("/")
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
