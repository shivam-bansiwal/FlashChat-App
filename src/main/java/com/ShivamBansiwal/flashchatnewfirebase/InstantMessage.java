package com.ShivamBansiwal.flashchatnewfirebase;

public class InstantMessage {
    private String message,author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }


}
