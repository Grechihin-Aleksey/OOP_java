import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                System.out.println("------------------------");
                Human sergei = new Human("Сергей", "муж.",
                                45, "Александра", "Петр", "Анна");
                System.out.println(sergei);

                ArrayList<Child> children = new ArrayList<>();

                Child nikolai = new Child("Николай", "Муж", 25, "Анна",
                                sergei.getNameAncestor(), sergei.getWife());

                Child dim = new Child("Дмитрий", "Муж", 19, "нет.",
                                sergei.getNameAncestor(), sergei.getWife());

                sergei.addChild2(children, nikolai); // добавил детей c печатью в консоль
                sergei.addChild2(children, dim);

                sergei.allChildren(); // запрос количества детей и получение информации о них.
        }
}