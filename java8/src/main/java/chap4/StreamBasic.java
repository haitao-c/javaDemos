package chap4;

/**
 * Stream的定义：从支持数据处理操作的源生成的元素序列
 * 源：提供数据的源，如集合、数组或输入/输出资源
 * 流与集合的区别：流是按需计算, 流只能遍历一次，遍历完之后，就说这个流已经被消费掉了
 * 可以从原始数据源哪里再获得一个新的流来重新遍历一遍
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamBasic {
    public static void main(String[] args) {
        //Java 7
        getLowCaloricDishesNamesInJava7(Dish.menu).forEach(System.out::println);

        System.out.println("---");

        // Java8
        getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);

        System.out.println(getNames(Dish.menu));
        Dish.menu.stream().forEach(System.out::println);
    }

    //筛选出低卡路里的食物
    public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : dishes) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }
        List<String> lowCaloricDishesName = new ArrayList<>();
        //对低卡路里的食物进行排序
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            public int compare(Dish d1, Dish d2) {
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });
        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }
        return lowCaloricDishesName;
    }

    public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
        return dishes.stream()
                .filter(d -> d.getCalories() < 400)     //  Stream<Dish> filter接收Lambda, 从流中排除某些元素
                .sorted(comparing(Dish::getCalories))   //  Stream<Dish> 按照Calory进行排序
                .map(Dish::getName)                     //  Stream<String>    map接收一个Lambda,将元素转换成成其他形式或提取信息
                .collect(toList());                     //   List<String>
    }

    public static List<String> getNames(List<Dish> dishes) {
        return dishes.stream()
                .filter(d -> {      // T -> boolean
                    System.out.println("filtering " + d.getName());
                    return d.getCalories() > 300;
                })
                .map(d->{           // T -> R
                    System.out.println("mapping "+d.getName());
                    return d.getName();
                })
                .limit(3)
                .collect(toList());

    }

}
