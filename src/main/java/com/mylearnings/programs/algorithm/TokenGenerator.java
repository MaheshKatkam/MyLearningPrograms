package com.mylearnings.programs.algorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class TokenGenerator {
    public static void main(String[] args) {
        try {
            String userId = "12345";
            String userGuid = "abcd-efgh-ijkl";
            String timestamp = String.valueOf(System.currentTimeMillis());

            // Step 1: Concatenate Data
            String tokenData = userId + ":" + userGuid + ":" + timestamp;

            // Step 2: Encrypt the Data
            SecretKey secretKey = AESEncryptionUtil.generateKey();
            IvParameterSpec iv = AESEncryptionUtil.generateIv();
            String encryptedToken = AESEncryptionUtil.encrypt(tokenData, secretKey, iv);

            // Step 3: Send token as Authorization header
            System.out.println("Encrypted Token: " + encryptedToken);

            // Decryption (For Testing)
            String decryptedData = AESEncryptionUtil.decrypt(encryptedToken, secretKey, iv);
            System.out.println("Decrypted Data: " + decryptedData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
