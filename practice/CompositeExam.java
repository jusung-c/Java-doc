package practice;

import java.util.ArrayList;
import java.util.List;

public class CompositeExam {
    public static void main(String[] args) {
        Composite c1 = new Composite();
        c1.add(new Leaf());
        c1.add(new Leaf());

        Composite c0 = new Composite();
        c0.add(new Leaf());
        c0.add(c1);

        c0.fn();
    }
}

interface Component {
    public void fn();
}

class Leaf implements Component {

    @Override
    public void fn() {
        System.out.println("Leaf");
    }
}

class Composite implements Component {

    private List<Component> list = new ArrayList<Component>();

    @Override
    public void fn() {
        System.out.println("Composite");
        for (Component c : list) {
            c.fn();
        }
    }

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }
}