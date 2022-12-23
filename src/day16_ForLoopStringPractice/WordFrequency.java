package day16_ForLoopStringPractice;

/*
write a program that can return the frequency of the  word "Java" from
the sentence
Ex:
sentence = "Java Java";
output:
2
sentence = "Java Python Java C# C# Java Cydeo"
 */
        public class WordFrequency {
        public static void main(String[] args) {
            String str = "Java Python Java C# C# Java Cydeo";

            // Count the frequency of the word "Java"
            int count = 0;
            for (int i = 0; i < str.length()-3; i++) {
                if (str.substring(i, i + 4).equals("Java")) {
                    count++;
                }
            }

            System.out.println("The frequency of the word 'Java' is: " + count);
        }
    }


