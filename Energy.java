package UI;

public class Energy extends Physic {
    void accessGravity(){
        System.out.println(getGravity());
    }
    float speed(float distance, float time){
        return multiply(distance, time);
    }
    float Force(float mass, float acceleration){
        return multiply(mass, acceleration);
    }
       float  pressure(float force, float area){
        return divide(force, area);
    }
     float mass(float force, float acceleration){
        return divide(force, acceleration);
         
    }

    
    
}


