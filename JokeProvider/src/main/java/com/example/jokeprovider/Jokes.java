package com.example.jokeprovider;


import java.util.Random;

public class Jokes {

    private static String[] jokes = {
            "Q: When do you serve tofu turkey? A: Pranksgiving.",
            "Q: What did the turkey say before it was roasted? A: Boy! I’m stuffed!",
            "Q: Why do turkeys always go, “gobble, gobble”? A: Because they never learned good table manners!",
            "Q: What key has legs and can’t open doors? A: A Turkey.",
            "Q: Why did the turkey cross the road? A: It was the chicken’s day off!",
            "Q: What do you call a running turkey? A: Fast food.",
            "Q: Why does a pilgrim’s pants always fall down? A: Because they wear their belt buckle on their hat.",
            "Q: What’s the best dance to do on Thanksgiving? A: The turkey trot",
            "Q: What did the turkey say to the computer? A: Google, google, google!",
            "Q: What do you call the age of a pilgrim? A: Pilgrimage.",
            "Q: What kind of face does a pilgrim make when he’s in pain? A: Pil-grimace.",
            "Q: What do you call a pilgrims vocabulary? A: Pilgrammar.",
            "Q: What was the turkey looking for at ToysRus? A: Gobbleheads.",
            "Q: What do you call a holiday dinner without the parents? A: Friendsgiving.",
            "Q: What do you get if you divide the circumference of a pumpkin by its diameter? A: Pumpkin pi.",
            "Q: What is a pumpkin’s favorite sport? A: Squash",
            "Asked to write a composition entitled, “What I’m thankful for on Thanksgiving,” Little Johnny wrote, “I am thankful that I’m not a turkey.”",
            "Knock Knock. Who There? Thanksgiving! Thanksgiving for what? Thanks giving us this turkey.",
            "Q. Why did the scarecrow win an award? A. Because he was outstanding in his field.",
            "Q. Did you hear about the cheese factory that exploded in France? A. There was nothing left but de Brie."
    };

    public Jokes(){}

    public String getJoke() {
        return jokes[getRandom()];
    }

    private int getRandom(){
        Random rand = new Random();
        int max = jokes.length - 1;
        int min = 0;
        return rand.nextInt((max - min + 1) + min);
    }
}
