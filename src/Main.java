import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mary mary = new Mary("Мэри");
        mary.method();
        mary.secondMethod();
    }
}
class Mary {
    private String name;
    private double happiness = 0.5;
    private String location;
    private String status;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Mary(String name) {
        this.name = name;
    }
    public void method() {
        double parameter = Math.random();
        double a = 1 / 3f;
        double b = 2 / 3f;
        while (happiness > 0 && happiness < 1) {
            if (parameter < a) {
                happiness += 0.08;
                setLocation("Старые клумбы");
                System.out.println(getName() + " подошла к " + getLocation());
                String str = String.format("%.0f", happiness * 100);
                System.out.println("Счастье " + getName() + " увеличилось на 8% и теперь равно: " + str + "%");
            }
            if (parameter >= a && parameter < b) {
                happiness += 0.04;
                setLocation("Заросшие лужайки");
                System.out.println(getName() + " подошла к " + getLocation());
                String str = String.format("%.0f", happiness * 100);
                System.out.println("Счастье " + getName() + " увеличилось на 4% и теперь равно: " + str + "%");
            }
            if (parameter >= b) {
                happiness -= 0.06;
                setLocation("Края дорожек");
                System.out.println(getName() + " подошла к " + getLocation());
                String str = String.format("%.0f", happiness * 100);
                System.out.println("Счастье " + getName() + " уменьшилось на 6% и теперь равно: " + str + "%");
            }
            parameter = Math.random();
        }
        if (happiness <= 0) {
            setStatus("Грустная");
            System.out.println("Теперь " + getName() + " " + getStatus() + ", и она не может увидеть много зелёных ростков.");
        }
        if (happiness >= 1) {
            setStatus("Весёлая");
            System.out.println("Теперь " + getName() + " " + getStatus() + ", и она может увидеть много зелёных ростков!");
        }
    }
    public void secondMethod() {
        class Weed {
            private String name;

            public String getName() {
                return name;
            }
            public Weed(String name) {
                this.name = name;
            }
        }
        Weed weed = new Weed("Сорняк");
        int numberOfFlowers = 1;
        double a = 1;
        double b = Math.random();
        System.out.println(getName() + " подошла к " + weed.getName());
        System.out.println(getName() + " вырвала " + numberOfFlowers + " " + weed.getName());
        while (a > b) {
            System.out.println(getName() + " подошла к следующему " + weed.getName());
            numberOfFlowers++;
            System.out.println(getName() + " вырвала " + numberOfFlowers + " " + weed.getName());
            a = Math.random();
            b = Math.random();
        }
        System.out.println("Мэри закончила прополку!");
        setStatus("finished");
    }
}