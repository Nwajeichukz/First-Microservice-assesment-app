package chuks.ansQuiz_server.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;


public class HelperUtils {


    public static HttpHeaders getHttpHeader() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer ");
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        return httpHeaders;
    }

//    public static String generateRandomString(int length) {
//        String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_";
//        SecureRandom secureRandom = new SecureRandom();
//
//        StringBuilder randomString = new StringBuilder(length);
//
//        for (int i = 0; i < length; i++) {
//            int randomIndex = secureRandom.nextInt(allowedCharacters.length());
//            randomString.append(allowedCharacters.charAt(randomIndex));
//        }
//
//        return randomString.toString();
//    }
//
//    public static String generateOtp(int len) {
//        String hotString = "0123498756";
//        SecureRandom secureRandom = new SecureRandom();
//
//        char[] ranString = new char[len];
//
//        for (int i = 0; i < len; i++) {
//            ranString[i] = hotString.charAt(secureRandom.nextInt(hotString.length()));
//        }
//
//        return new String(ranString);
//    }
//
//    public static LocalDateTime futureTime(int timeInMinute) {
//        LocalDateTime currentTime = LocalDateTime.now();
//
//        return currentTime.plusMinutes(timeInMinute);
//    }
//
//    public static String generateEmailBody(String template, Map<String, Object> data) {
//        Template mustache = Mustache.compiler().compile(template);
//
//        return mustache.execute(data);
//    }
}
