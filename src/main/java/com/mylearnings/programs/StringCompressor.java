package com.mylearnings.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressor {

    public static void main(String[] args) {
        String input = "aaabbaaabbaaccccdbbccccdd";
        compressString(input);
    }

    public static void compressString(String input) {
        StringBuilder currentGroup = new StringBuilder();
        Map<String, Integer> groupCounts = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            currentGroup.append(input.charAt(i));
            if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
                String group = currentGroup.toString();
                groupCounts.put(group, groupCounts.getOrDefault(group, 0) + 1);
                currentGroup.setLength(0);
            }
        }

        for (Map.Entry<String, Integer> entry : groupCounts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
        }
    }
}
