package com.medicalfile.app.config.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
@ConfigurationProperties("rsa")
public record RsaKeysConfig (RSAPublicKey publicKey,RSAPrivateKey privateKey){
}