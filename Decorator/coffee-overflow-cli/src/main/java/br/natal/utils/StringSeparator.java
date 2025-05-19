package br.natal.utils;

public enum StringSeparator {
    BASIC("- ", "\n");

    public final String begin;
    public final String end;

    StringSeparator(String begin, String end) {
        this.begin = begin;
        this.end = end;
    }

}
