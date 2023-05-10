
    public class Energy extends Physics {


        void accessingGravity() {
            System.out.println(getGravity());
            //setGravity(10f);
            //System.out.println(getGravity());
        }

        float potentialEnergy (float mass, float height) {
            return mass * height * getGravity();
        }
        float workDone (float force , float distance) { return force * distance;
      }
       float force (float mass, float acceleration) { return mass * acceleration;
       }
           

    }


