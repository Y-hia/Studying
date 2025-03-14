package d6_enum;

/**
 * 认识枚举
 */
public enum Test {

    SELF(1,"自助"),
    HELP(2,"帮助"),
    ;
    private final String name;
    private final String value;

    Test(int name, String value) {
        this.name = name + "";
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
