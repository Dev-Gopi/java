package com.opss.polymorphism;
class Model{
    int modelId;
    String settingMood;
    int speed;
    int currentScore =0;
    String reset;
    int load(int modelId, String settingMood){
        this.modelId = modelId;
        this.settingMood = settingMood;
        return this.currentScore;
    }


    int run(int speed, int currentScore){
        this.speed = speed;
        this.currentScore = currentScore;
        return this.currentScore;
    }

    Boolean stop(int currentScore, String reset){
        this.currentScore = currentScore;
        this.reset = reset;
        return true;
    }
}
class ModelAdv extends Model{
    @Override
    int load(int modelId, String settingMood){
        this.modelId = modelId;
        this.settingMood = settingMood;
        System.out.println("Model "+this.modelId);
        System.out.println("Mood "+this.settingMood);
        return this.currentScore;
    }
    @Override
    int run(int speed, int currentScore){
        this.speed = speed;
        this.currentScore = currentScore;
        for (int i = 0; i < 10; i++) {
            this.currentScore += i;
        }
        System.out.println("Speed "+this.speed);
        System.out.println("Current Score "+this.currentScore);
        return this.currentScore;
    }
    @Override
    Boolean stop(int currentScore, String reset){
        this.currentScore = currentScore;
        this.reset = reset;
        System.out.println("Current Score "+this.currentScore);
        System.out.println("Reset "+this.reset);
        return true;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Model obj = new ModelAdv();
        int cc = obj.load(10,"hard");
        int ccc = obj.run(1000,cc);
        obj.stop(ccc,"all");
    }
}
