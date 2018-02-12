package com.example.kuba.historicalquizandroid;



public class Questions {

    public String mQuestions[]={

            "W którym roku, maiała miejsce bitwa pod Grunwaldem?",
            "Gdzie urodził się Napoleon I Bonaparte?",
            "Kto był pierwszym cesarzem Imperium Rzymskiego?",
            "Kto dowodził Macedończykami w bitwie pod Gaugamelą?",
            "Kto był ostatnim królem Polski?",
            "Kogo pokonali Polacy w bitwie warszawskiej?",
            "W którym państwie 14 lipca jest świętem narodowym?",
            "Kto był przywódcą bolszewików?",
            "Kto dowodził wojskammi Konfederacji w wojnie secesyjnej?",
            "Kogo pokonała polska flota w bitwie pod Oliwą?",

    };

    private String Choices[][]={
            {"1410", "1258", "1525", "1648"},
            {"w Paryżu", "w Maryslii", "w Nicei", "na Korsyce"},
            {"Juliusz Cezar", "Neron", "Oktawian August", "Kaligula"},
            {"Leonidas", "Aleksander Wielki", "Filip II", "Perykles"},
            {"August II Mocny", "Mieszko I", "Jan III Sobieski", "Stanisław August Poniatowski"},
            {"Niemców", "Szwedów", "Sowietów", "Turków"},
            {"we Francji", "w USA", "w Polsce", "w Niemczech"},
            {"Stalin", "Dzierżyński", "Lenin", "Trocki"},
            {"Jerzy Waszyngton", "Robert E.Lee" ,"George Patton", "Ulysses S.Grant"},
            {"Anglików", "Niemców", "Rosjan", "Szwedów"}

    };

    private String CorrectAnswers[]={

            "1410",
            "na Korsyce",
            "Oktawian August",
            "Aleksander Wielki",
            "Stanisław August Poniatowski",
            "Sowietów",
            "we Francji",
            "Lenin",
            "Robert E.Lee",
            "Szwedów",
    };

    public String getQuestion(int a){

        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = Choices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = Choices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = Choices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = Choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = CorrectAnswers[a];
        return answer;
    }
}
