package item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

//생성자에 매개변수가 많다면 빌더를 고려하라
//불변식(invariant) : 프로그램이 실행되는 동안 반드시 만족해야 하는 조건
//covariant return typing : 하위 클래스의 메서드가 상위클래스의 메서드가 정의한 반환타입이 아닌 그 하위타입을 반환

public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
