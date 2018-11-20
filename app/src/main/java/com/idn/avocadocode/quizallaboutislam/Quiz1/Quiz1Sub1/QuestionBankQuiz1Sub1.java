package com.idn.avocadocode.quizallaboutislam.Quiz1.Quiz1Sub1;

public class QuestionBankQuiz1Sub1 {

    private String textQuestions [] = {
            "Siapa nama ayah Nabi Shallallu alahi wasalam",
            "Siapa nama ibu Nabi Shallallu alahi wasalam?",
            "Dimana Nabi Shallallu alahi wasalam Lahir?",
            "Siapa Kakek Nabi Shallallu alahi wasalam?",
            "Nabi ﷺ adalah keturunan Ibrahim 'alaihi salam dari jalur?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Abdillah", "Al-Khatab", "Abdul-Muthalib", "Abu Tholib"},
            {"Aminah", "Aisyah", "Khadijah", "Fatimah"},
            {"Madinah", "Mekkah", "Jeddah", "Baitul Maqdis"},
            {"Abdillah", "Al-Khatab", "Abdul-Muthalib", "Abu Tholib"},
            {"Ishak 'alaihi salam", "Yakub 'alaihi salam", "Yusuf 'alaihi salam", "Ismail 'alaihi salam"}
    };

    private String mCorrectAnswers[] = {"Abdillah", "Aminah", "Mekkah", "Abdul-Muthalib", "Ismail 'alaihi salam"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}