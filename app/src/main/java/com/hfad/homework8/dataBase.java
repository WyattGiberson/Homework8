package com.hfad.homework8;

import java.util.ArrayList;
import java.util.Queue;

public class dataBase {
    private static ArrayList<QuizQuestions> quizQuestions;

    public static ArrayList<QuizQuestions> getData(){
        if(quizQuestions == null){
            loadData();
        }
        return quizQuestions;
    }

    private static void loadData() {
        quizQuestions = new ArrayList<QuizQuestions>();


        ArrayList<String> questions = new ArrayList<String>();

        //Geography
        //-----------------------------------------
        questions.add("Which ocean is the largest?");
        questions.add("How many countries are in the world?");
        questions.add("What is the name of the longest river in the world?");
        questions.add("Which country has the largest population?");
        questions.add("Which planet is closest to Earth?");

        //Sports
        //-----------------------------------------
        questions.add("Who won the first superbowl in NFL history?");
        questions.add("How many NFL teams play in New Jersey and New York?");
        questions.add("How many points did Kobe Bryant score in his last NBA game?");
        questions.add("How many gold medals has Michael Phelps been awarded in his olympic career?");
        questions.add("What player has the most NBA Championships in NBA History?");
        questions.add(" Who has earned more Grand Slam single titles during the open era in tennis.");

        //Video Games
        //-----------------------------------------
        questions.add("Which company created the famous plumber Mario?");
        questions.add("What is the name of the famous video character who is a blue hedgehog?");
        questions.add("As of 2022, which of the following is the best selling video game of all time?");
        questions.add("How do you craft a cake in Minecraft?");
        questions.add("Who is Donkey Kong’s son?");
        questions.add("How many Xenoblade Chronicles have been created?");

        //Animals
        //-----------------------------------------
        questions.add("What colour is a polar bear’s skin?");
        questions.add("Which jellyfish has the deadliest sting?");
        questions.add("Hyenas scavenge more than lions do");
        questions.add("What is the giant panda’s closest relative?");
        questions.add("Which one of these animals cannot swim?");



        ArrayList<ArrayList<String>> choices = new ArrayList<ArrayList<String>>();
        //Choices Array Lists
        //Geography
        //-----------------------------------------
        ArrayList<String> optionsGeo1 = new ArrayList<String>();
        ArrayList<String> optionsGeo2 = new ArrayList<String>();
        ArrayList<String> optionsGeo3 = new ArrayList<String>();
        ArrayList<String> optionsGeo4 = new ArrayList<String>();
        ArrayList<String> optionsGeo5 = new ArrayList<String>();

        //Sports
        //-----------------------------------------
        ArrayList<String> optionsSports1 = new ArrayList<String>();
        ArrayList<String> optionsSports2 = new ArrayList<String>();
        ArrayList<String> optionsSports3 = new ArrayList<String>();
        ArrayList<String> optionsSports4 = new ArrayList<String>();
        ArrayList<String> optionsSports5 = new ArrayList<String>();
        ArrayList<String> optionsSports6 = new ArrayList<String>();

        //Video Games
        //-----------------------------------------
        ArrayList<String> optionsVideo1 = new ArrayList<String>();
        ArrayList<String> optionsVideo2 = new ArrayList<String>();
        ArrayList<String> optionsVideo3 = new ArrayList<String>();
        ArrayList<String> optionsVideo4 = new ArrayList<String>();
        ArrayList<String> optionsVideo5 = new ArrayList<String>();
        ArrayList<String> optionsVideo6 = new ArrayList<String>();

        //Animals
        //-----------------------------------------
        ArrayList<String> optionsAnimals1 = new ArrayList<String>();
        ArrayList<String> optionsAnimals2 = new ArrayList<String>();
        ArrayList<String> optionsAnimals3 = new ArrayList<String>();
        ArrayList<String> optionsAnimals4 = new ArrayList<String>();
        ArrayList<String> optionsAnimals5 = new ArrayList<String>();


        //Filling the Array Lists
        //Geography
        //-----------------------------------------
        optionsGeo1.add("Pacific");
        optionsGeo1.add("Atlantic");
        optionsGeo1.add("Arctic");
        optionsGeo1.add("Indian");
        //-----------------------------------------
        optionsGeo2.add("192");
        optionsGeo2.add("195");
        optionsGeo2.add("193");
        optionsGeo2.add("197");
        //-----------------------------------------
        optionsGeo3.add("Mississippi");
        optionsGeo3.add("Nile");
        optionsGeo3.add("Congo");
        optionsGeo3.add("Amazon");
        //-----------------------------------------
        optionsGeo4.add("United States");
        optionsGeo4.add("China");
        optionsGeo4.add("Japan");
        optionsGeo4.add("India");
        //-----------------------------------------
        optionsGeo5.add("Mars");
        optionsGeo5.add("Mercury");
        optionsGeo5.add("Venus");
        optionsGeo5.add("Jupiter");


        //Sports
        //-----------------------------------------
        optionsSports1.add("Eagles");
        optionsSports1.add("Packers");
        optionsSports1.add("Cowboys");
        optionsSports1.add("76ers");
        optionsSports1.add("Ravens");
        //-----------------------------------------
        optionsSports2.add("1");
        optionsSports2.add("2");
        optionsSports2.add("Infinite");
        optionsSports2.add("7");
        optionsSports2.add("3");
        //-----------------------------------------
        optionsSports3.add("50");
        optionsSports3.add("100");
        optionsSports3.add("75");
        optionsSports3.add("60");
        //-----------------------------------------
        optionsSports4.add("28");
        optionsSports4.add("7");
        optionsSports4.add("23");
        optionsSports4.add("13");
        //-----------------------------------------
        optionsSports5.add("Michael Jordan");
        optionsSports5.add("Magic Johnson");
        optionsSports5.add("Bill Russel");
        optionsSports5.add("Lebron James");
        //-----------------------------------------
        optionsSports6.add("Venus Williams");
        optionsSports6.add("Roger Federer");
        optionsSports6.add("Rafael Nadal");
        optionsSports6.add("Serena Williams");
        optionsSports6.add("Novak Djokvic");

        //Video Games
        //-----------------------------------------
        optionsVideo1.add("Sega");
        optionsVideo1.add("Nintendo");
        optionsVideo1.add("Sony");
        optionsVideo1.add("Atari");
        //-----------------------------------------
        optionsVideo2.add("Sonic");
        optionsVideo2.add("Tails");
        optionsVideo2.add("Knuckles");
        optionsVideo2.add("Amy");
        //-----------------------------------------
        optionsVideo3.add("Wii Sports");
        optionsVideo3.add("Grand Theft Auto V");
        optionsVideo3.add("Tetris");
        optionsVideo3.add("Minecraft");
        //-----------------------------------------
        optionsVideo4.add("place 3 milk, 2 sugar, 1 egg, and 3 wheat in the 3x3 crafting grid");
        optionsVideo4.add("place 2 milk, 3 sugar, 2 eggs, and 3 wheat in the 3x3 crafting grid");
        optionsVideo4.add("place 3 milk, 5 sugar, 6 eggs, and 3 wheat in the 3x6 crafting grid.");
        optionsVideo4.add("place 1 milk, 1 sugar, 1 egg, and 1 wheat in the 1x1 crafting grid.");
        //-----------------------------------------
        optionsVideo5.add("Diddy Kong");
        optionsVideo5.add("Donkey Kong Jr");
        optionsVideo5.add("Dixie Kong");
        optionsVideo5.add("Papa Kong");
        //-----------------------------------------
        optionsVideo6.add("1");
        optionsVideo6.add("5");
        optionsVideo6.add("4");
        optionsVideo6.add("10");

        //Animals
        //-----------------------------------------
        optionsAnimals1.add("Black");
        optionsAnimals1.add("White");
        optionsAnimals1.add("Pink");
        optionsAnimals1.add("Brown");
        //-----------------------------------------
        optionsAnimals2.add("Man-o-war");
        optionsAnimals2.add("Box jellyfish");
        optionsAnimals2.add("Irukandji Jellyfish");
        optionsAnimals2.add("Sea Nettle");
        //-----------------------------------------
        optionsAnimals3.add("True");
        optionsAnimals3.add("False");
        //-----------------------------------------
        optionsAnimals4.add("Grizzly bear");
        optionsAnimals4.add("Polar bear");
        optionsAnimals4.add("Raccoon");
        optionsAnimals4.add("Cat");
        optionsAnimals4.add("Spectacled bear");
        //-----------------------------------------
        optionsAnimals5.add("Hippo");
        optionsAnimals5.add("Sloth");
        optionsAnimals5.add("Bats");
        optionsAnimals5.add("Elk");
        optionsAnimals5.add("Fish");





        //Geography
        //-----------------------------------------
        choices.add(optionsGeo1);
        choices.add(optionsGeo2);
        choices.add(optionsGeo3);
        choices.add(optionsGeo4);
        choices.add(optionsGeo5);

        //Sports
        //-----------------------------------------
        choices.add(optionsSports1);
        choices.add(optionsSports2);
        choices.add(optionsSports3);
        choices.add(optionsSports4);
        choices.add(optionsSports5);
        choices.add(optionsSports6);

        //Video Games
        //-----------------------------------------
        choices.add(optionsVideo1);
        choices.add(optionsVideo2);
        choices.add(optionsVideo3);
        choices.add(optionsVideo4);
        choices.add(optionsVideo5);
        choices.add(optionsVideo6);

        //Animals
        //-----------------------------------------
        choices.add(optionsAnimals1);
        choices.add(optionsAnimals2);
        choices.add(optionsAnimals3);
        choices.add(optionsAnimals4);
        choices.add(optionsAnimals5);


        ArrayList<String> answers = new ArrayList<String>();
        //Geography
        //-----------------------------------------
        answers.add("Pacific");
        answers.add("195");
        answers.add("Nile");
        answers.add("China");
        answers.add("Venus");

        //Sports
        //-----------------------------------------
        answers.add("Packers");
        answers.add("3");
        answers.add("60");
        answers.add("23");
        answers.add("Bill Russel");
        answers.add("Serena Williams");

        //Video Games
        //-----------------------------------------
        answers.add("Nintendo");
        answers.add("Sonic");
        answers.add("Minecraft");
        answers.add("place 3 milk, 2 sugar, 1 egg, and 3 wheat in the 3x3 crafting grid.");
        answers.add("Donkey Kong Jr.");
        answers.add("5");

        //Animals
        //-----------------------------------------
        answers.add("Black");
        answers.add("Irukandji Jellyfish");
        answers.add("False");
        answers.add("Spectacled bear");
        answers.add("Hippo");

        ArrayList<String> fact = new ArrayList<String>();
        //Geography
        //-----------------------------------------
        fact.add("The Pacific Ocean stretches to an astonishing 63.8 million square miles!");
        fact.add("Africa has the most countries of any continent with 54.");
        fact.add("Explorer John Hanning Speke discovered the source of the Nile on August 3rd, 1858.");
        fact.add("Shanghai is the most populated city in China with a population of 24,870,891925.");
        fact.add("Follow-up fact: Even though Venus is the closest, the planet it still ~38 million miles from Earth!");

        //Sports
        //-----------------------------------------
        fact.add("The Packers have won the NFL championship 4 times.");
        fact.add("The Giants and Jets both play in New Jersey, but are New York Based. The Buffalo Bills are the only team that actually plays in New York.");
        fact.add("Kobe scored over 60 five times during his career.");
        fact.add("Michael Phelps is the most successful olympian for owning the most medals and most gold medals of any athlete");
        fact.add("Bill Russel won the NBA championship 11 times in his career!");
        fact.add("Serena and Her Sister Venus won 14 Grand Slam Doubles titles and three doubles gold medals at the Olympics");

        //Video Games
        //-----------------------------------------
        fact.add("Nintendo created Mario in 1981 for the arcade game Donkey Kong.");
        fact.add("In some official concept art, Sonic was originally meant to be a rabbit.");
        fact.add("As of 2022, Minecraft has sold over 238 million units.");
        fact.add("Cake is the only food that has to be placed for players to eat it.");
        fact.add("Donkey Kong Jr. has appeared only in the game Super Mario Kart for " +
                "Super Nintendo Entertainment System as a playable character celebrating the 10th anniversary " +
                "of his arcade game and his shared history with Mario.");
        fact.add("Xenoblade Chronicles was originally going to be titled \"Monado: Beginning of the World\" " +
                "and was not intended as an entry into the Xeno series.");


        //Animals
        //-----------------------------------------
        fact.add("Polar bear fur is actually hollow and transparent!");
        fact.add("Some jellyfish species are functionally immortal.");
        fact.add("Lions actually scavenge for food more than they hunt it.");
        fact.add("Despite common belief, molecular studies show that pandas are in fact closer to bears than raccoons.");
        fact.add("Hippos are the world’s most dangerous land mammal.");



        ArrayList<String> genre = new ArrayList<String>();

        //Geography
        //-----------------------------------------
        genre.add("Geography");
        genre.add("Geography");
        genre.add("Geography");
        genre.add("Geography");
        genre.add("Geography");

        //Sports
        //-----------------------------------------
        genre.add("Sports");
        genre.add("Sports");
        genre.add("Sports");
        genre.add("Sports");
        genre.add("Sports");
        genre.add("Sports");

        //Video Games
        //-----------------------------------------
        genre.add("Video Games");
        genre.add("Video Games");
        genre.add("Video Games");
        genre.add("Video Games");
        genre.add("Video Games");
        genre.add("Video Games");

        //Animals
        //-----------------------------------------
        genre.add("Animals");
        genre.add("Animals");
        genre.add("Animals");
        genre.add("Animals");
        genre.add("Animals");

        for (int i = 0; i < questions.size(); i++) {
            quizQuestions.add(new QuizQuestions(questions.get(i), choices.get(i), answers.get(i), fact.get(i), genre.get(i)));
            System.out.print(quizQuestions.get(i));
        }
    }

}
