package UI;

public class Energy extends Physic {
    void accessGravity(){
        System.out.println(getGravity());
    }
    float speed(float distance, float time){
        return multiply(distance, time);
    }
    float Force(float m, float a){
        return multiply(m, a);
    }
       float  pressure(float force, float area){
        return divide(force, area);
    }
     float young modulus(float stress, float strain){
        return divide(stress, strain);
    }

    //float areaofsquare(float length, float breadth){
        //return multiply(length, breadth);
    }


