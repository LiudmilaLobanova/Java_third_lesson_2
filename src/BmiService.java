public class BmiService {

    public float calculate(float weight, float height) {

        float IMT = 10000 * weight / (height * height);

        return IMT;

    }

}
