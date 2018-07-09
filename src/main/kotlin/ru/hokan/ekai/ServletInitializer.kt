package ru.hokan.ekai

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import ru.hokan.ekai.configurations.EkaiApplication

class ServletInitializer : SpringBootServletInitializer() {

    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(EkaiApplication::class.java)
    }

}
