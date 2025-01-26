package solid.srp.incorrect;

public enum TransformType {
    UPPERCASE {
        public String apply(String s) {
            return s.toUpperCase();
        }
    },
    LOWERCASE {
        public String apply(String s) {
            return s.toLowerCase();
        }
    },
    SPLIT {
        public String apply(String s) {
            String[] split = s.split("");

            // StringBuilder is a good idea here

            StringBuilder builder = new StringBuilder();

            for (String c : split) {
                builder.append(c).append(" ");
            }

            return builder.toString();
        }
    };

    public String apply(String s) {
        return "Transformation type is not supported!";
    }
}
