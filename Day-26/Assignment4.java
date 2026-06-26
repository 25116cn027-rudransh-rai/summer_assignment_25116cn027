import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "What is the capital of India?",
            "Which language is used for Android apps?",
            "What does CPU stand for?"
        };
        String[] answers = {"delhi", "java", "central processing unit"};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine().toLowerCase();

            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is " + answers[i]);
            }
        }

        System.out.println("Your final score = " + score + "/" + questions.length);
        sc.close();
    }
}