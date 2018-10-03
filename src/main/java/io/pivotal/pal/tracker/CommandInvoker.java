package io.pivotal.pal.tracker;

public class CommandInvoker {
    public static void main(String[] args) {
        SomeCommand cmd = () -> "Some Command Output";
    }
}
