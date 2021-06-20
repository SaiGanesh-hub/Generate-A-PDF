package com.sai.project.config;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.FileTemplateResolver;

public enum ThymeleafConfig {

    INSTANCE;
    private final TemplateEngine templateEngine;

    ThymeleafConfig() {
        templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(getTemplateResolver());
    }

    public static TemplateEngine getTemplateEngine() {
        return INSTANCE.templateEngine;
    }

    private FileTemplateResolver getTemplateResolver() {
        FileTemplateResolver templateResolver = new FileTemplateResolver();
        templateResolver.setPrefix(getTemplatePath());
        templateResolver.setTemplateMode(TemplateMode.TEXT);
        return templateResolver;
    }

    private String getTemplatePath() {
        return ThymeleafConfig.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "templates/";
    }
}
