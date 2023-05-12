package UI;

public class Physic {
    private float gravity = 10f;

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public float multiply(float num1, float num2){
        return num1 *num2;
    }

    public float divide(int num1,int num2){
        return num1/num2;
    }
       float  pressure(float force, float area){
        return divide(force, area);
    }

}
