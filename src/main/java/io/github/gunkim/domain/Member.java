package io.github.gunkim.domain;

public record Member(
    Long id,
    String username,
    String password,
    Role role
) {
}