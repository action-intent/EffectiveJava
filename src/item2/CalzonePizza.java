package item2;

public class CalzonePizza extends Pizza {
    private final boolean sauceInside;

    public CalzonePizza(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public boolean isSauceInside() {
        return sauceInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return self();
        }

        @Override
        public CalzonePizza build() {
            return new CalzonePizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
