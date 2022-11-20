package io.github.neopixel.http.query;

public class QueryParameter {

    private final HypixelQueryParameterTypes type;
    private final String value;

    /**
     * Keeps track of the parameters passed into the {@link Query} constructor.
     *
     * @param type  The type of the parameter being passed in.
     * @param value The value of the parameter being passed in.
     */
    public QueryParameter(HypixelQueryParameterTypes type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {

        if (getClass() != o.getClass()) {
            return false;
        }

        QueryParameter other = (QueryParameter) o;
        return type.equals(other.type()) && value.equals(other.value());
    }

    public HypixelQueryParameterTypes type() {
        return type;
    }

    public String value() {
        return value;
    }
}
