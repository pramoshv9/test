package com.interview.question;

import java.util.*;

public class EdTechSystem {
    public static void main(String[] args) {
        String[] input = {
                "Alice:Math=80,Science=90,English=70",
                "Bob:Math=85,Science=80,English=88",
                "Charlie:Math=78,Science=82,English=79"
        };

        // Map to store student names and their average grades
        Map<String, Integer> studentGrades = new HashMap<>();
        String topStudent = null;
        int highestGrade = 0;

        // Process each student's data
        for (String record : input) {
            String[] parts = record.split(":");
            String name = parts[0];
            String[] grades = parts[1].split(",");

            // Calculate total grades and count subjects
            int total = 0;
            for (String grade : grades) {
                total += Integer.parseInt(grade.split("=")[1]);
            }

            // Calculate average grade
            int average = total / grades.length;
            studentGrades.put(name, average);

            // Determine top student
            if (average > highestGrade) {
                highestGrade = average;
                topStudent = name;
            }
        }

        // Output each student's average grade
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Output the top student
        System.out.println("Top Student: " + topStudent);
    }
}

