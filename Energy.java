package UI;

public class Energy extends Physic {
    void accessGravity(){
        System.out.println(getGravity());
    }
    float speed(float distance, float time){
        return multiply(distance, time);
    }
    float force(float m, float a){
        return multiply(m, a);
    }

    //float areaofsquare(float length, float breadth){
        //return multiply(length, breadth);
    }


