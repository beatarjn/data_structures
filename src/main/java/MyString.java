import lombok.Data;

@Data
public class MyString {

    private String value;

    public MyString(String value) {
        this.value = value;
    }
}
