package br.com.erudio.rest_with_spring_boot_and_java;

public class Greeting {
    private final Long id;
    private final String content;

    public Greeting(String content, Long id) {
        this.content = content;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
