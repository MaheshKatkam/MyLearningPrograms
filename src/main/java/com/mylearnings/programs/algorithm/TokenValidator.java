package com.mylearnings.programs.algorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class TokenValidator {
    private static final long SESSION_EXPIRY_TIME = 30 * 60 * 1000; // 30 mins

    public static boolean isTokenValid(String encryptedToken, SecretKey secretKey, IvParameterSpec iv) {
        try {
            // Step 1: Decrypt Token
            String decryptedData = AESEncryptionUtil.decrypt(encryptedToken, secretKey, iv);
            System.out.println("Decrypted Data: " + decryptedData);

            // Step 2: Extract Timestamp
            String[] parts = decryptedData.split(":");
            if (parts.length != 3) return false;

            long loginTime = Long.parseLong(parts[2]);
            long currentTime = System.currentTimeMillis();

            // Step 3: Check if session is expired
            return (currentTime - loginTime) <= SESSION_EXPIRY_TIME;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            String encryptedToken = "<PUT_ENCRYPTED_TOKEN_HERE>"; // Replace with actual token
            SecretKey secretKey = AESEncryptionUtil.generateKey();
            IvParameterSpec iv = AESEncryptionUtil.generateIv();

            boolean isValid = isTokenValid(encryptedToken, secretKey, iv);
            System.out.println("Is Token Valid? " + isValid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

